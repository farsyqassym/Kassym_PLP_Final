package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Competition;

import java.util.List;

public interface CompetitionService {

   public Competition saveCompetition(Competition competition);

   public List<Competition> fetchCompetitionList();

   public Competition fetchComptetionById(Long competitionId);

//  public Competition updateCompetition(Long id, Competition competition);
}
