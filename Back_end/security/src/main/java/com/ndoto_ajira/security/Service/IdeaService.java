package com.ndoto_ajira.security.Service;

import com.ndoto_ajira.security.Model.Idea;

import java.util.List;

public interface IdeaService {
   public Idea saveIdea(Idea idea);

   public List<Idea> fetchIdeaList();

   public Idea fetchIdeaById(Long ideaId);

   public void deleteIdeaById(Long ideaId);

   public Idea updateIdea(Long ideaId, Idea idea);
}
