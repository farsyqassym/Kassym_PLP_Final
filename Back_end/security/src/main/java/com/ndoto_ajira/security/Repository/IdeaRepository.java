package com.ndoto_ajira.security.Repository;

import com.ndoto_ajira.security.Model.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends JpaRepository<Idea,Long> {
}
