package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Employer;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:25
 */
public interface EmployersActivationByEmployeesService {

    Result confirmEmployer(Employer employer);
}
