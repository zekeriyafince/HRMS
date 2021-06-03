package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.ActivationCodeService;
import com.zekeriyafince.hrms.core.utilities.results.ErrorResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.ActivationCodeDao;
import com.zekeriyafince.hrms.entities.concretes.ActivationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 22:03
 */
@Service
public class ActivationCodeManager implements ActivationCodeService {

    private ActivationCodeDao activationCodeDao;

    @Autowired
    public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
        this.activationCodeDao = activationCodeDao;
    }

    @Override
    public String createActivationCode() {
        ActivationCode activationCode = new ActivationCode();
        activationCode.setActivationCode("aktivasyonkodu1");
        return activationCode.getActivationCode();
    }

    @Override
    public void sendEmail(String email) {
        System.out.println("Doğrulama kodu için email gönderildi ->" + email);
    }

    @Override
    public Result verifyUserWithActivationCode(String code) {
        if (this.activationCodeDao.existsByActivationCode(code)) {
            return new SuccesResult("Doğrulama işleminiz başarılı.");
        }
        return new ErrorResult("Doğrulama işleminiz başarısız.");
    }

}
