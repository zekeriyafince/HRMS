package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:44
 */
public interface CurriculumVitaeService {

    Result add(CurriculumVitaeWithCandidateDto dto, int cvId);

    DataResult<CurriculumVitaeWithCandidateDto> getByCandidateId(int cvId);

}
