package com.ndoto_ajira.security.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ideaId;
    private String title;
    private String description;

    @ManyToMany(mappedBy = "ideas",
            fetch = FetchType.EAGER)
    private Set<User> users;
}
