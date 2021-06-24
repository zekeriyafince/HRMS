package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.ExperienceService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 16.06.2021 14:16:52
 */
@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {

    private ExperienceService experienceService;

    @Autowired
    public ExperiencesController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    
    @GetMapping("/getAll")
    DataResult<List<Experience>> getAll() {
        return this.experienceService.getAll();
    }

    @GetMapping("/getAllByCvIdOrderByEndingDateDesc")
    DataResult<List<Experience>> getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(int cvId) {
        return this.experienceService.getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(cvId);
    }

}
