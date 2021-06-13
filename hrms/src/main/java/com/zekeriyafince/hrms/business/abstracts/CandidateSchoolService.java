package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.CandidateSchool;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:46
 */
public interface CandidateSchoolService {

    Result add(CandidateSchool candidateSchool);

    DataResult<List<CandidateSchool>> getAll();

}
