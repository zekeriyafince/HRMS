package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.Result;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:24
 */
public interface ActivationCodeService {

    String createActivationCode();

    void sendEmail(String email);

    Result verifyUserWithActivationCode(String code);
}
