package com.ndoto_ajira.security.Repository;

import com.ndoto_ajira.security.Model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
