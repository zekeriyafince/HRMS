package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.CandidateSkill;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:49
 */
public interface CandidateSkillService {

    Result add(CandidateSkill candidateSkill);

    DataResult<List<CandidateSkill>> getAll();
}
