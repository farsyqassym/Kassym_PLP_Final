package com.ndoto_ajira.security.Repository;

import com.ndoto_ajira.security.Model.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<Theme,Long> {
}
