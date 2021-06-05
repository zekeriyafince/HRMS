package com.zekeriyafince.hrms.business.adapters.concretes;

import com.zekeriyafince.hrms.business.adapters.abstracts.UserCheckService;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import java.util.Date;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 05.06.2021 15:40
 */
@Service
public class FakeMernisAdapter implements UserCheckService {

    @Override
    public Result checkIfRealPerson(String identityNumber, String firstName, String lastName, Date dateOfBirth) {
        return new SuccesResult();
    }

}
