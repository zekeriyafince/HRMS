package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Candidate;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:39
 */
public interface CandidateService {

    DataResult<List<Candidate>> gettAll();
    DataResult<Candidate> getById(int candidateId);

    Result add(Candidate candidate);
}
