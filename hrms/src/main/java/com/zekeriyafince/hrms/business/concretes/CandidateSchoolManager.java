package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CandidateSchoolService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CandidateSchoolDao;
import com.zekeriyafince.hrms.entities.concretes.CandidateSchool;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:02
 */
@Service
public class CandidateSchoolManager implements CandidateSchoolService {

    private CandidateSchoolDao candidateSchoolDao;

    @Autowired
    public CandidateSchoolManager(CandidateSchoolDao candidateSchoolDao) {
        this.candidateSchoolDao = candidateSchoolDao;
    }

    @Override
    public Result add(CandidateSchool candidateSchool) {
        this.candidateSchoolDao.save(candidateSchool);
        return new SuccesResult("Okul Bilgisi Eklenildi.");
    }

    @Override
    public DataResult<List<CandidateSchool>> getAll() {
        return new SuccessDataResult<List<CandidateSchool>>(this.candidateSchoolDao.findAll(), "Okul Bilgisi listelendi.");
    }

}
