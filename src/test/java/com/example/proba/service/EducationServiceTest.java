package com.example.proba.service;

import com.example.proba.model.Education;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.anyLong;

@ExtendWith(MockitoExtension.class)
class EducationServiceTest {

    private static final Education EDUCATION = new Education(null, "ZSP2", "Technikum", "opis", LocalDate.now(), LocalDate.now());


    @Mock
    private EducationService educationService;


    @Test
    void shouldAddEducation() {
        //given & when & then
        educationService.addNewSchool(EDUCATION);
    }

    @Test
    void shouldShowListOfAllEducation() {
        //given & when & then
        educationService.getAllEducations();
    }

    @Test
    void shouldGetEducationById() {
        educationService.getEducationById(anyLong());
    }

    @Test
    void shouldEditEducation() {
        educationService.editEducation(EDUCATION);
    }

    @Test
    void shouldDeleteEducation() {
        educationService.deleteEducation(EDUCATION.getId());
    }


}