package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 00:25
 */
public interface CandidateCurriculumVitaeService {

    DataResult<List<CandidateCurriculumVitae>> getAll();

    DataResult<CandidateCurriculumVitae> getById(int cvId);
}
