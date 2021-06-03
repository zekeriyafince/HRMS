package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.JobPosition;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:15
 */
public interface JobPositionService {

    DataResult<List<JobPosition>> getAll();

    Result add(JobPosition jobPosition);
}
