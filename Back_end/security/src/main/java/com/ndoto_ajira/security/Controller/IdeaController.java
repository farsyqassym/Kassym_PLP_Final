package com.ndoto_ajira.security.Controller;

import com.ndoto_ajira.security.Model.Idea;
import com.ndoto_ajira.security.Service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeaController {

    @Autowired
    private IdeaService ideaService;


    @PostMapping("/ideas")
    public Idea saveIdea(@RequestBody Idea idea){
        return ideaService.saveIdea(idea);
    }

    @GetMapping("/ideas")
    public List<Idea> fetchIdeaList(){
        return ideaService.fetchIdeaList();
    }

    @GetMapping("/ideas/{id}")
    public Idea fetchIdeaById(@PathVariable("id") Long ideaId){
        return ideaService.fetchIdeaById(ideaId);
    }

    @DeleteMapping("/ideas/{id}")
    public String deleteIdeaById(@PathVariable("id") Long ideaId){
        ideaService.deleteIdeaById(ideaId);
        return "idea deleted successfully";
    }

    @PutMapping("/ideas/{id}")
    public Idea updateIdea(@PathVariable("id") Long ideaId,
                           @RequestBody Idea idea){
        return ideaService.updateIdea(ideaId, idea);
    }
}
