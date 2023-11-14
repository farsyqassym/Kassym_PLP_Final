package com.example.lastsmida.Service;

import com.example.lastsmida.Model.Theme;
import com.example.lastsmida.Repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService{

    @Autowired
    private ThemeRepository themeRepository;
//    @Override
//    public List<Theme> getThemesByCompetitionId(Long id) {
//        return themeRepository.findByCompetitionsId(id);
//    }
}
