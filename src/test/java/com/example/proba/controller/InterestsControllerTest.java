package com.example.proba.controller;

import com.example.proba.model.Interests;
import com.example.proba.service.InterestsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

@ExtendWith(MockitoExtension.class)
class InterestsControllerTest {

    private static final Interests INTERESTS = new Interests(1L, "interests");

    @Mock
    private Model model;

    @Mock
    private InterestsService interestsService;

    @InjectMocks
    private InterestsController interestsController;

    @Test
    void shouldGetInterests() {
        String result = interestsController.getInterests(model);
        model.addAttribute("interests", result);
    }

    @Test
    void shouldGetAddInterestsDescription() {
        interestsController.getAddInterestsDescription();
    }

    @Test
    void postAddInterestsDescription() {
        interestsController.postAddInterestsDescription(INTERESTS);

    }

    @Test
    void getEditInterestsDescription() {
        String result = interestsController.getEditInterestsDescription(1L, model);
        model.addAttribute("interests", result);
    }

    @Test
    void postEditInterestsDescription() {
        interestsController.postEditInterestsDescription(INTERESTS);
    }

    @Test
    void deleteInterests() {
        interestsController.deleteInterests(1L);
    }
}