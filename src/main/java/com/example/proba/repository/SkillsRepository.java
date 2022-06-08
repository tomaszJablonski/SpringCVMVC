package com.example.proba.repository;

import com.example.proba.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SkillsRepository extends JpaRepository<Skill, Long> {
}
