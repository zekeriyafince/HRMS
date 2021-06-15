package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.JobAdvertisement;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 07.06.2021 21:10
 */
public interface JobAdvertisementService {

    Result add(JobAdvertisement jobadvertisement);
    Result changeJobAdvertisementStatus(int jobAdvertisementId, boolean isActive);

    DataResult<List<JobAdvertisement>> getByGetAllIsActiveTrue();

    DataResult<List<JobAdvertisement>> getAllSorted();

    DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_userId(int employerId);
    
    DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByCreatedDateAsc();
}
