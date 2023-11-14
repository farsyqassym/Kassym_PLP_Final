package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Service.ApplicantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/applicants")
    public List<Applicant> fetchApplicant(@RequestBody Applicant applicant){
        return applicantService.fetchApplicant(applicant);
    }

}
