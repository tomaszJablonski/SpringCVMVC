package com.example.proba.service;

import com.example.proba.model.Interests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class InterestsServiceTest {

    private static final Interests INTERESTS = new Interests(1L, "interests");

    @Mock
    private InterestsService interestsService;

    @Test
    void shouldGetInterestsDescription() {
        interestsService.getInterestsDescription();
    }

    @Test
    void shouldAddInterestsDescription() {
        interestsService.addInterestsDescription(INTERESTS);
    }

    @Test
    void shouldEditInterestsDescription() {
        interestsService.editInterestsDescription(INTERESTS);
    }

    @Test
    void shouldGetInterestsById() {
        interestsService.getInterestsById(1l);
    }

    @Test
    void deleteInterestsDescription() {
        interestsService.deleteInterestsDescription(1L);
    }


}