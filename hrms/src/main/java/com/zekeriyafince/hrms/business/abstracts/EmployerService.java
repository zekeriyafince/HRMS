package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Employer;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:38
 */
public interface EmployerService {

    DataResult<List<Employer>> gettAll();

    Result add(Employer employer);
}
