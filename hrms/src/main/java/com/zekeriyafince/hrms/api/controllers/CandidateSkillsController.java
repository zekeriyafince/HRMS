package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.CandidateSkillService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.CandidateSkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 16.06.2021 14:12:10
 */
@RestController
@RequestMapping("/api/skills")
public class CandidateSkillsController {

    private CandidateSkillService candidateSkillService;

    @Autowired
    public CandidateSkillsController(CandidateSkillService candidateSkillService) {
        this.candidateSkillService = candidateSkillService;
    }

    @PostMapping("/add")
    Result add(CandidateSkill candidateSkill) {
        return this.candidateSkillService.add(candidateSkill);
    }

    @GetMapping("/getAll")
    DataResult<List<CandidateSkill>> getAll() {
        return this.candidateSkillService.getAll();
    }

}
