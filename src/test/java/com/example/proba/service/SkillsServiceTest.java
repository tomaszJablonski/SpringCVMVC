package com.example.proba.service;

import com.example.proba.model.Skill;
import com.example.proba.repository.SkillsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SkillsServiceTest {

    private static final Skill SKILL = new Skill(1L, "skill");

    @Mock
    private SkillsRepository skillsRepository;

    @InjectMocks
    private SkillsService skillsService;

    @Test
    void shouldGetAllSkills() {
        skillsService.getAllSkills();
    }

    @Test
    void shouldAddSkill() {
        skillsService.addSkill(SKILL);
    }

    @Test
    void editSkill() {
        skillsService.editSkill(SKILL);
    }

    @Test
    void getSkillById() {
        skillsService.getSkillById(1L);
    }

    @Test
    void deleteSkill() {
        skillsService.deleteSkill(1L);
    }
}