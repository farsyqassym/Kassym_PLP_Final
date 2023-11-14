package com.ndoto_ajira.security.Model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Applicant extends User {

    private String univercity;
}
