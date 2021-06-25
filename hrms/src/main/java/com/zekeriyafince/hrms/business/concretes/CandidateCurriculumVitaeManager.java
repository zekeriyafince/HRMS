package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CandidateCurriculumVitaeService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CandidateCurriculumVitaeDao;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import com.zekeriyafince.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import java.util.List;
import org.modelmapper.ModelMapper;
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
    private ModelMapper modelMapper;

    @Autowired
    public CandidateCurriculumVitaeManager(CandidateCurriculumVitaeDao candidateCurriculumVitaeDao, ModelMapper modelMapper) {
        this.candidateCurriculumVitaeDao = candidateCurriculumVitaeDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public DataResult<List<CandidateCurriculumVitae>> getAll() {
        return new SuccessDataResult<List<CandidateCurriculumVitae>>(this.candidateCurriculumVitaeDao.findAll(), "CV Havuzu");
    }

    @Override
    public DataResult<CandidateCurriculumVitae> getById(int cvId) {
        return new SuccessDataResult<CandidateCurriculumVitae>(this.candidateCurriculumVitaeDao.getById(cvId), "CV listed");
    }

    @Override
    public Result add(CandidateCurriculumVitae cv) {

        this.candidateCurriculumVitaeDao.save(cv);
        return new SuccesResult("Resume has added");
    }

    @Override
    public DataResult<List<CandidateCurriculumVitae>> getByCandidateCurriculumVitaeIdForCandidateId(int candidateId) {
        return new SuccessDataResult<List<CandidateCurriculumVitae>>(this.candidateCurriculumVitaeDao.getByCandidate(1));
    }
}
