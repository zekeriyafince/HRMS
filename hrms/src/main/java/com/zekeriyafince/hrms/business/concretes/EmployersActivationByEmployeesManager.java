package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.EmployersActivationByEmployeesService;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:31
 */
@Service
public class EmployersActivationByEmployeesManager implements EmployersActivationByEmployeesService {

    @Override
    public Result confirmEmployer(Employer employer) {
        return new SuccesResult("Şirket başarıyla doğrulandı. ->" + employer.getCompanyName());
    }

}
