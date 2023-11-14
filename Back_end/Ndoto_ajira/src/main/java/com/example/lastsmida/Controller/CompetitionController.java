package com.example.lastsmida.Controller;

import com.example.lastsmida.Model.Competition;
import com.example.lastsmida.Model.Theme;
import com.example.lastsmida.Service.CompetitionService;
import com.example.lastsmida.Service.CompetitionServiceImpl;
import com.example.lastsmida.Service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class CompetitionController {

    @Autowired
    private CompetitionService competitionService;

    @Autowired
    private CompetitionServiceImpl competitionServiceImpl;


    @PostMapping("/competitions")
    public Competition saveCompetition(@RequestBody Competition competition) {
        return competitionService.saveCompetition(competition);
    }

    @GetMapping("/competitions")
    public List<Competition> fetchCompetitionList() {
        return competitionService.fetchCompetitionList();
    }

    @GetMapping("/competitions/{id}")
    public Competition fetchComptetionById(@PathVariable("id") Long id){
        return competitionService.fetchComptetionById(id);
    }


//    @PutMapping("/competitions/{id}")
//    public Competition updateCompetition(@PathVariable("id") Long id,
//                                         @RequestBody Competition competition){
//        return competitionService.updateCompetition(id, competition);
//    }

//    @PutMapping("/competitions/{id}")
//    public Competition updateCompetition(@RequestBody Competition competition){
//        return competitionServiceImpl.updateCompetition(competition);
//    }


}