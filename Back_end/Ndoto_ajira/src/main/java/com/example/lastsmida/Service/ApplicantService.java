package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Applicant;
import com.example.lastsmida.Repository.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public Applicant saveApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public List<Applicant> fetchApplicant(Applicant applicant) {
        return applicantRepository.findAll();
    }
}
