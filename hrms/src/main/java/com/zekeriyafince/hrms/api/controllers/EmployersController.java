package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.EmployerService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.entities.concretes.Employer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.06.2021 22:15
 */
@RestController
@RequestMapping("/api/employers")
public class EmployersController {

    private EmployerService empoyerService;

    @Autowired
    public EmployersController(EmployerService empoyerService) {
        this.empoyerService = empoyerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll() {
        return this.empoyerService.gettAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer) {
        return this.empoyerService.add(employer);
    }

}
