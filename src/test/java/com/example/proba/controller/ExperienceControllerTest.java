package com.example.proba.controller;

import com.example.proba.model.Experience;
import com.example.proba.service.ExperienceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class ExperienceControllerTest {

    private static final Experience EXPERIENCE = new Experience(1L, "Junior Java Developer", "Write programs and tests for them", "description", LocalDate.now(), LocalDate.now());

    @Mock
    private Model model;

    @Mock
    private ExperienceService experienceService;

    @InjectMocks
    private ExperienceController experienceController;

    @Test
    void shouldGetAllExperience() {
        //given & when
        String result = experienceController.getAllExperience(model);
        model.addAttribute("experience", result);
        //then
        assertThat(result).isEqualTo("/experience/experience");
    }

    @Test
    void shouldGetAddExperience() {
        //given & when
        String result = experienceController.getAddExperience();
        //then
        assertThat(result).isEqualTo("/experience/addExperience");
    }

    @Test
    void postAddExperience() {
        experienceService.addNewExperience(EXPERIENCE);
    }

    @Test
    void getEditExperience() {
        experienceController.getEditExperience(1L, model);
        model.addAttribute("experience", EXPERIENCE);
    }

    @Test
    void postEditExperience() {
        experienceService.editExperience(EXPERIENCE);
    }

    @Test
    void deleteExperience() {
        experienceService.deleteExperience(1L);
    }
}