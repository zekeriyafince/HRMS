package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.SocialMediaLinkService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.SocialMediaLink;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 16.06.2021 14:04:33
 */
@RestController
@RequestMapping("/api/socialMedias")
public class SocialMediaLinkEmployer {

    private SocialMediaLinkService socialMediaLinkService;

    @Autowired
    public SocialMediaLinkEmployer(SocialMediaLinkService socialMediaLinkService) {
        this.socialMediaLinkService = socialMediaLinkService;
    }

    
    @GetMapping("/getAll")
    DataResult<List<SocialMediaLink>> getAll() {
        return this.socialMediaLinkService.getAll();
    }

}
