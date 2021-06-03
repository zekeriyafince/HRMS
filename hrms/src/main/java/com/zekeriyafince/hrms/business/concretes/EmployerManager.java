package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.ActivationCodeService;
import com.zekeriyafince.hrms.business.abstracts.EmployerService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.ErrorResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.EmployerDao;
import com.zekeriyafince.hrms.dataAccess.abstracts.UserDao;
import com.zekeriyafince.hrms.entities.concretes.Employer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:33
 */
@Service
public class EmployerManager implements EmployerService {

    private UserDao userDao;
    private EmployerDao employerDao;
    private ActivationCodeService activationCodeService;

    @Autowired
    public EmployerManager(UserDao userDao, EmployerDao employerDao, ActivationCodeService activationCodeService) {
        this.userDao = userDao;
        this.employerDao = employerDao;
        this.activationCodeService = activationCodeService;
    }

    @Override
    public DataResult<List<Employer>> gettAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İşverenler(Şirketler) listelendi.");
    }

    @Override
    public Result add(Employer employer) {
        //MAİL SPLİTİ OLUŞTURMA
        String[] splittedMail = employer.getEmail().split("@");
        // EMAİL KULLANILMIŞ MI
        if (this.userDao.existsByEmail(employer.getEmail())) {
            return new ErrorResult("Bu email çoktan kullanılmış !");
        }
        //DOĞRU DOMAİNLİ EMAİL Mİ
        if (!splittedMail[1].equals(employer.getWebAddress())) {
            return new ErrorResult("Yalnızca Şirket Web Sitenizin Uzantısına Sahip Bir Mail Adresiyle Kayıt Olabilirsiniz");
        }
        this.employerDao.save(employer);
        //Activation Code Simülasyonu
        this.activationCodeService.createActivationCode();
        this.activationCodeService.sendEmail(employer.getEmail());

        return new SuccesResult("Tebrikler ! kayıt işleminiz başarılı.");
    }

}
