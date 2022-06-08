package com.example.proba.controller;

import com.example.proba.model.Skill;
import com.example.proba.service.SkillsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class SkillsControllerTest {

    private static final Skill SKILL = new Skill(1L, "skill");

    @Mock
    private Model model;

    @Mock
    private SkillsService skillsService;

    @InjectMocks
    private SkillsController skillsController;

    @Test
    void shouldGetSkills() {
        String result = skillsController.getSkills(model);
        model.addAttribute("skill", result);
    }

    @Test
    void shouldGetAddSkill() {
        String result = skillsController.getAddSkill();
        assertThat(result).isEqualTo("/skills/addSkill");
    }

    @Test
    void shouldPostAddSkill() {
        skillsController.postAddSkill(SKILL);
    }

    @Test
    void shouldGetEditSkill() {
        String result = skillsController.getEditSkill(1L, model);
        model.addAttribute("skill", result);
    }

    @Test
    void shouldPostEditSkill() {
        skillsController.postEditSkill(1L, SKILL);
    }

    @Test
    void deleteSkill() {
        skillsController.deleteSkill(1L);
    }
}