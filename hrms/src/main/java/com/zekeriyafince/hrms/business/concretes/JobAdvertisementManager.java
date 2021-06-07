package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.JobAdvertisementService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.zekeriyafince.hrms.entities.concretes.JobAdvertisement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 07.06.2021 21:10
 */
@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao advertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
        this.advertisementDao = advertisementDao;
    }

    @Override
    public Result add(JobAdvertisement jobadvertisement) {
        advertisementDao.save(jobadvertisement);
        return new SuccesResult("Başarıyla eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByGetAllIsActiveTrue() {
        return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByIsActiveTrue(), "listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.ASC, "createDate");
        return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.findAll(sort), "listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_userId(int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByIsActiveTrueAndEmployer_Id(employerId));
    }

    @Override
    public Result changeJobAdvertisementStatus(int jobAdvertisementId, boolean isActive) {
        JobAdvertisement jobAdvertisement = this.advertisementDao.findById(jobAdvertisementId).get();
        jobAdvertisement.setActive(isActive);
        this.advertisementDao.save(jobAdvertisement);
        return new SuccesResult("İlan durumu değiştirildi.");
    }

}
