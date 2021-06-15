package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Experience;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:50
 */
public interface ExperienceService {

    Result add(Experience experience);

    DataResult<List<Experience>> getAll();
    
    DataResult<List<Experience>> getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(int cvId);
}
