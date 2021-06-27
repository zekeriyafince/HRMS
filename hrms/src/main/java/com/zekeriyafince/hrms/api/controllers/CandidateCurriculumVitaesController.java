package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.CandidateCurriculumVitaeService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import com.zekeriyafince.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 00:29
 */
@RestController
@RequestMapping("/api/cvs")
public class CandidateCurriculumVitaesController {

    private CandidateCurriculumVitaeService candidateCurriculumVitaeService;

    @Autowired
    public CandidateCurriculumVitaesController(CandidateCurriculumVitaeService candidateCurriculumVitaeService) {
        super();
        this.candidateCurriculumVitaeService = candidateCurriculumVitaeService;

    }

    @GetMapping("/getall")
    public DataResult<List<CandidateCurriculumVitae>> getAll() {

        return this.candidateCurriculumVitaeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CandidateCurriculumVitae cv) {
        return this.candidateCurriculumVitaeService.add(cv);
    }

    @PostMapping("/getByCandidateId")
    public DataResult<List<CandidateCurriculumVitae>> getByCandidateId(@RequestParam("candidateId") int candidateId) {
        //System.out.println(candidateId);
        return this.candidateCurriculumVitaeService.getByCandidateId(candidateId);
    }
}
