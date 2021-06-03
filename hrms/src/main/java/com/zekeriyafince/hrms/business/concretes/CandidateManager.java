package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.ActivationCodeService;
import com.zekeriyafince.hrms.business.abstracts.CandidateService;
import com.zekeriyafince.hrms.business.adapters.abstracts.UserCheckService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.ErrorResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.CandidateDao;
import com.zekeriyafince.hrms.dataAccess.abstracts.UserDao;
import com.zekeriyafince.hrms.entities.concretes.Candidate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:38
 */
@Service
public class CandidateManager implements CandidateService {

    private UserDao userDao;
    private CandidateDao candidateDao;
    private ActivationCodeService activationCodeService;
    private UserCheckService userCheckService;

    @Autowired
    public CandidateManager(UserDao userDao, CandidateDao candidateDao, ActivationCodeService activationCodeService, UserCheckService userCheckService) {
        this.userDao = userDao;
        this.candidateDao = candidateDao;
        this.activationCodeService = activationCodeService;
        this.userCheckService = userCheckService;
    }

    @Override
    public DataResult<List<Candidate>> gettAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Listeleme Başarılı");
    }

    @Override
    public Result add(Candidate candidate) {

        //AYNI TC NO'YA SAHİP KULLANICI VAR MI 
        if (candidateDao.existsByNationalIdentityNumber(candidate.getNationalIdentityNumber())) {
            return new ErrorResult("Bu tc kimlik numarasına sahip başka bir kullanıcı var.");
        }
        //AYNI EMAİLE SAHİP KULLANICI VAR MI
        if (userDao.existsByEmail(candidate.getEmail())) {
            return new ErrorResult("Bu emaile sahip başka bir kullanıcı var.");
        }
        //MERNİS DOĞRULAMASI
        if (!userCheckService.checkIfRealPerson(candidate.getNationalIdentityNumber(), candidate.getFirstName(), candidate.getLastName(), candidate.getDateOfBirth()).isSuccess()) {
            return new ErrorResult("Mernis doğrulaması gerçekleitirilemedi.");
        }

        this.candidateDao.save(candidate);
        this.activationCodeService.createActivationCode();
        this.activationCodeService.sendEmail(candidate.getEmail());
        return new SuccesResult("Tebrikler ! Başarı ile kayıt oldunuz.");
    }

}
