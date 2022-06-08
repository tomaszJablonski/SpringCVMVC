package com.example.proba.service;

import com.example.proba.model.Skill;
import com.example.proba.repository.SkillsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkillsService {

    private final SkillsRepository skillsRepository;

    public List<Skill> getAllSkills() {
        return skillsRepository.findAll();
    }

    public void addSkill(Skill skill) {
        skillsRepository.save(skill);
    }

    public void editSkill(Skill skill) {
        skillsRepository.save(skill);
    }

    public Skill getSkillById(Long id) {
        return skillsRepository.findById(id).orElse(null);
    }

    public void deleteSkill(Long id) {
        skillsRepository.deleteById(id);
    }


}
