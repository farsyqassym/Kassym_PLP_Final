package com.example.lastsmida.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class
Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date issueDate;
    private String description;
    private String address;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deadline;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startingDate;


    @EqualsAndHashCode.Exclude
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "competition_theme",
            joinColumns = {
                    @JoinColumn(name = "competitionId")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "themeId")
            })
    private Set<Theme> themes = new HashSet<>();
    //--------------------------------------

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "competitionId", referencedColumnName = "id")
    private Set<Application> applications;

}
