package com.zekeriyafince.hrms.business.abstracts;

import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.SocialMediaLink;
import java.util.List;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 22:51
 */
public interface SocialMediaLinkService {

    Result add(SocialMediaLink socialMediaLink);

    DataResult<List<SocialMediaLink>> getAll();
}
