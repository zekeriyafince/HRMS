package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.CandidateSchoolService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.CandidateSchool;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 16.06.2021 11:43:28
 */
@RestController
@RequestMapping("/api/schools")
public class CandidateSchoolsController {

    private CandidateSchoolService candidateSchoolService;

    @Autowired
    public CandidateSchoolsController(CandidateSchoolService candidateSchoolService) {
        this.candidateSchoolService = candidateSchoolService;
    }

    @PostMapping("/add")
    Result add(CandidateSchool candidateSchool) {
        return this.candidateSchoolService.add(candidateSchool);
    }

    @GetMapping("/getAll")
    DataResult<List<CandidateSchool>> getAll() {
        return this.candidateSchoolService.getAll();
    }

    @GetMapping("/getAllByCv")
    DataResult<List<CandidateSchool>> getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(int cvId) {
        return this.candidateSchoolService.getAllByCandidateCurriculumVitae_CvIdOrderByFinishDateDesc(cvId);
    }

}
