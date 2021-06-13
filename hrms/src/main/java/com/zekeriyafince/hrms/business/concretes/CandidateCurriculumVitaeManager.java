package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CandidateCurriculumVitaeService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CandidateCurriculumVitaeDao;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 00:26
 */
@Service
public class CandidateCurriculumVitaeManager implements CandidateCurriculumVitaeService {

    private CandidateCurriculumVitaeDao candidateCurriculumVitaeDao;

    @Autowired
    public CandidateCurriculumVitaeManager(CandidateCurriculumVitaeDao candidateCurriculumVitaeDao) {
        this.candidateCurriculumVitaeDao = candidateCurriculumVitaeDao;
    }

    @Override
    public DataResult<List<CandidateCurriculumVitae>> getAll() {
        return new SuccessDataResult<List<CandidateCurriculumVitae>>(this.candidateCurriculumVitaeDao.findAll(), "CV Havuzu");
    }

    @Override
    public DataResult<CandidateCurriculumVitae> getById(int cvId) {
        return new SuccessDataResult<CandidateCurriculumVitae>(this.candidateCurriculumVitaeDao.getById(cvId), "CV listed");
    }
}
