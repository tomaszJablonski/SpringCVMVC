package com.example.proba.controller;

import com.example.proba.model.Education;
import com.example.proba.service.EducationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class EducationControllerTest {

    private static final Education EDUCATION = new Education(null, "ZSP2", "Technikum", "opis", LocalDate.now(), LocalDate.now());

    @Mock
    private Model model;

    @Mock
    private EducationService educationService;

    @InjectMocks
    private EducationController educationController;

    @Test
    void shouldGetAllEducation() {
        //given & when
        String result = educationController.getAllEducation(model);
        model.addAttribute("education", result);
        //then
        assertEquals("/education/education", result);
    }

    @Test
    void shouldGetAddEducation() {
        //given & when
        String result = educationController.getAddEducation();
        //then
        assertEquals("/education/addEducation", result);
    }

    @Test
    void shouldPostAddEducation() {
        //give & when & then
        educationService.addNewSchool(EDUCATION);
    }

    @Test
    void shouldGetEditEducation() {
        //give & when
        String result = educationController.getEditEducation(1L, model);
        model.addAttribute("education", result);
        //then
        assertEquals("/education/editEducation", result);

    }

    @Test
    void shouldPostEditEducation() {
        //give & when & then
        educationService.editEducation(EDUCATION);
    }

    @Test
    void shouldDeleteEducation() {
        educationService.deleteEducation(1L);
    }


}