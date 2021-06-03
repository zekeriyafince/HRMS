package com.zekeriyafince.hrms.business.adapters.concretes;

import com.zekeriyafince.hrms.business.adapters.abstracts.UserCheckService;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import java.time.ZoneId;
import java.util.Date;
import org.springframework.stereotype.Service;
import tr.gov.nvi.tckimlik.ws.*;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 21:41
 */
@Service
public class MernisCheckServiceAdapter implements UserCheckService {

    @Override
    public Result checkIfRealPerson(String identityNumber, String firstName, String lastName, Date dateOfBirth) {
        KPSPublic service = new KPSPublic();
        KPSPublicSoap kpsPublicSoapProxy = service.getKPSPublicSoap();
        boolean result = true;

        try {
            result = kpsPublicSoapProxy.tcKimlikNoDogrula(
                    Long.parseLong(identityNumber),
                    firstName.toUpperCase(),
                    lastName.toUpperCase(),
                    dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
            );
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (result) {
            return new Result(true);
        } else {
            return new Result(false, "kimlik doğrulama başarısız.");
        }
    }

}
