package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.EmployersActivationByEmployeesService;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 22:13
 */
@RestController
@RequestMapping("/api/adminactivation")
public class EmployersActivationByEmployeesController {

    private EmployersActivationByEmployeesService employersActivationByEmployeesService;

    @Autowired
    public EmployersActivationByEmployeesController(EmployersActivationByEmployeesService employersActivationByEmployeesService) {
        this.employersActivationByEmployeesService = employersActivationByEmployeesService;
    }

    @PostMapping("/verify")
    public Result verifyEmployer(Employer employer) {
        return this.employersActivationByEmployeesService.confirmEmployer(employer);
    }

}
