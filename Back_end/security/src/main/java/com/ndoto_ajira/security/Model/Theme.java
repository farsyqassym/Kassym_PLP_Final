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
public class Theme {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long themeId;
    private String title;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "themeId",
            referencedColumnName = "themeId")
    private Set<Idea> ideas;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "competition_theme",
            joinColumns = {
                    @JoinColumn(name = "themeId",
                            referencedColumnName = "themeId")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "competitionId",
                            referencedColumnName = "competitionId")
            })
    private Set<Competition> competitions;
}
