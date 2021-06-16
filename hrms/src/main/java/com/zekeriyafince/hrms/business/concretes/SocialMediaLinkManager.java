package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.SocialMediaLinkService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.dataAccess.abstracts.SocialMediaLinkDao;
import com.zekeriyafince.hrms.entities.concretes.SocialMediaLink;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:13
 */
@Service
public class SocialMediaLinkManager implements SocialMediaLinkService {

    private SocialMediaLinkDao socialMediaLinkDao;

    @Autowired
    public SocialMediaLinkManager(SocialMediaLinkDao socialMediaLinkDao) {
        this.socialMediaLinkDao = socialMediaLinkDao;
    }

    @Override
    public Result add(SocialMediaLink socialMediaLink) {
        this.socialMediaLinkDao.save(socialMediaLink);
        return new SuccesResult("Sosyal Medya Bilgisi Eklenildi.");
    }

    @Override
    public DataResult<List<SocialMediaLink>> getAll() {
        return new SuccessDataResult<List<SocialMediaLink>>(this.socialMediaLinkDao.findAll(), "Sosyal Medya Bilgisi listelendi.");
    }

}
