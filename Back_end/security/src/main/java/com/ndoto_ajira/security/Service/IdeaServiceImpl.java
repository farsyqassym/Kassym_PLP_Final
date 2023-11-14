package com.ndoto_ajira.security.Service;

import com.ndoto_ajira.security.Model.Idea;
import com.ndoto_ajira.security.Repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class IdeaServiceImpl implements IdeaService{

    @Autowired
    private IdeaRepository ideaRepository;

    @Override
    public Idea saveIdea(Idea idea) {
        return ideaRepository.save(idea);
    }

    @Override
    public List<Idea> fetchIdeaList() {
        return ideaRepository.findAll();
    }

    @Override
    public Idea fetchIdeaById(Long ideaId) {
        return ideaRepository.findById(ideaId).get();
    }

    @Override
    public void deleteIdeaById(Long ideaId) {
        ideaRepository.deleteById(ideaId);
    }

    @Override
    public Idea updateIdea(Long ideaId, Idea idea) {
        Idea ideaDB = ideaRepository.findById(ideaId).get();

        if (Objects.nonNull(idea.getTitle()) &&
                !"".equalsIgnoreCase(idea.getTitle())){
            ideaDB.setTitle(idea.getTitle());
        }

        if (Objects.nonNull(idea.getDescription())&&
                !"".equalsIgnoreCase(idea.getDescription())){
            ideaDB.setDescription(idea.getDescription());
        }

        return ideaRepository.save(ideaDB);
    }

}
