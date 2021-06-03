package com.zekeriyafince.hrms.business.adapters.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.Result;
import java.util.Date;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:40
 */
public interface UserCheckService {

    Result checkIfRealPerson(String identityNumber, String firstName, String lastName, Date dateOfBirth);
}
