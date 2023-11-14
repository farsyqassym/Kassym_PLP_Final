package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Competition;
import com.example.lastsmida.Repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CompetitionServiceImpl implements CompetitionService{

    @Autowired
    private CompetitionRepository competitionRepository;

    @Override
    public Competition saveCompetition(Competition competition) {
        return competitionRepository.save(competition);
    }

    @Override
    public List<Competition> fetchCompetitionList() {
        return competitionRepository.findAll();
    }

    @Override
    public Competition fetchComptetionById(Long id) {
        return competitionRepository.findById(id).get();
    }

    public Competition updateCompetition(Competition competition) {
        Competition competition1 = competitionRepository.findById(competition.getId()).orElse(null);
        competition1.setTitle(competition.getTitle());
        competition1.setDescription(competition.getDescription());
        competition1.setAddress(competition.getAddress());
        competition1.setType(competition.getType());
        competition1.setStartingDate(competition.getStartingDate());
        competition1.setDeadline(competition.getDeadline());
        competition1.setIssueDate(competition.getIssueDate());

        return competitionRepository.save(competition1);
    }

//    @Override
//    public Competition updateCompetition(Long id, Competition competition) {
//        Competition competitionDB = competitionRepository.findById(id).get();
//
//        if (Objects.nonNull(competition.getTitle())&&
//        !"".equalsIgnoreCase(competition.getTitle())){
//            competitionDB.setTitle(competition.getTitle());
//        }
//
//        if (Objects.nonNull(competition.getAddress())&&
//        !"".equalsIgnoreCase(competition.getAddress())){
//            competitionDB.setAddress(competition.getAddress());
//        }
//
//        if (Objects.nonNull(competition.getDescription())&&
//        !"".equalsIgnoreCase(competition.getDescription())){
//            competitionDB.setDescription(competition.getDescription());
//        }
//
//        if (Objects.nonNull(competition.getType())&&
//        !"".equalsIgnoreCase(competition.getType())){
//            competitionDB.setType(competition.getType());
//        }
//
//        if (Objects.nonNull(competition.getStartingDate()){
//            competitionDB.setStartingDate(competition.getStartingDate());
//        }
//    }
}

