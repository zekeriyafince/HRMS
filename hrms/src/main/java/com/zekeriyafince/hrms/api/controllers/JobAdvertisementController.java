package com.zekeriyafince.hrms.api.controllers;

import com.zekeriyafince.hrms.business.abstracts.JobAdvertisementService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccessDataResult;
import com.zekeriyafince.hrms.entities.concretes.JobAdvertisement;
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
 * @date 07.06.2021 21:24
 */
@RequestMapping(value = "/api/jobadvertisement")
@RestController
public class JobAdvertisementController {

    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @PostMapping("/add")
    Result add(@RequestBody JobAdvertisement jobadvertisement) {
        return jobAdvertisementService.add(jobadvertisement);
    }

    @PostMapping("/changeJobAdvertisementStatus")
    Result changeJobAdvertisementStatus(@RequestBody int idJobAdvertisement, boolean status) {
        return jobAdvertisementService.changeJobAdvertisementStatus(idJobAdvertisement, status);
    }

    @GetMapping("/getByGetAllIsActiveTrue")
    DataResult getByGetAllIsActiveTrue() {
        return new SuccessDataResult(this.jobAdvertisementService.getByGetAllIsActiveTrue(), "Aktif iş ilanları listelendi.");
    }

    @GetMapping("/getAllSorted")
    DataResult getAllSorted() {
        return new SuccessDataResult(this.jobAdvertisementService.getAllSorted(), "Aktif iş ilanları tarihe göre listelendi.");
    }

    @GetMapping("/getByIsActiveTrueAndEmployer_userId")
    DataResult getByIsActiveTrueAndEmployer_userId(@RequestParam int employerId) {
        return new SuccessDataResult(this.jobAdvertisementService.getByIsActiveTrueAndEmployer_userId(employerId), "Firmanın aktif iş ilanları listelendi.");
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
//        Map<String, String> validationErrors = new HashMap<String, String>();
//        for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
//            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
//        }
//        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "doğrulama hataları");
//        return errors;
//    }

}
