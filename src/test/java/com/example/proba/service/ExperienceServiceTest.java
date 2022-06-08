package com.example.proba.service;

import com.example.proba.model.Experience;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class ExperienceServiceTest {

    private static final Experience EXPERIENCE = new Experience(1L, "Junior Java Developer", "Write programs and tests for them", "description", LocalDate.now(), LocalDate.now());

    @Mock
    private ExperienceService experienceService;

    @Test
    void shouldAddNewExperience() {
        //given & when & then
        experienceService.addNewExperience(EXPERIENCE);
    }

    @Test
    void shouldGetAllExperience() {
        //given & when & then
        experienceService.getAllExperience();
    }

    @Test
    void shouldGetExperienceById() {
        //given & when & then
        experienceService.getExperienceById(1L);
    }

    @Test
    void shouldEditExperience() {
        //given & when & then
        experienceService.editExperience(EXPERIENCE);
    }

    @Test
    void deleteExperience() {
        //given & when & then
        experienceService.deleteExperience(1L);
    }
}