package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.ExperienceService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.ExperienceDao;
import com.zekeriyafince.hrms.entities.concretes.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:08
 */
@Service
public class ExperienceManager implements ExperienceService {
    
    private ExperienceDao experienceDao;
    
    @Autowired
    public ExperienceManager(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }
    
    @Override
    public Result add(Experience experience) {
        this.experienceDao.save(experience);
        return new SuccesResult("Deneyim Bilgisi Eklenildi.");
    }
    
    @Override
    public DataResult<List<Experience>> getAll() {
        return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(), "Deneyim Bilgisi listelendi.");
    }
    
    @Override
    public DataResult<List<Experience>> getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(int cvId) {
        return new SuccessDataResult<List<Experience>>(this.experienceDao.getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(cvId), "Deneyim Bilgisi listelendi.");
    }
    
}
