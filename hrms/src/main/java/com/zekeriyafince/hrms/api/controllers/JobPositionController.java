package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.JobPositionService;
import com.zekeriyafince.hrms.entities.concretes.JobPosition;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:20
 */
@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }
    

    @GetMapping("/getAll")
    public List<JobPosition> getAll() {
        return this.jobPositionService.getAll();
    }

}
