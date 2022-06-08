package com.example.proba.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AuthorisationControllerTest {

    @InjectMocks
    private AuthorisationController authorisationController;

    @Test
    void shouldGetLogin() {
        String result = authorisationController.getLogin();
        assertThat(result).isEqualTo("auth/login");
    }
}