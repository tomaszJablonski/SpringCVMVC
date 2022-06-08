package com.example.proba.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class HomeControllerTest {

    @InjectMocks
    private HomeController homeController;

    @Test
    void shouldGetIndex() {
        //given & when
        String result = homeController.getIndex();
        //then
        assertThat(result).isEqualTo("/index");
    }

    @Test
    void getAbout() {
        //given & when
        String result = homeController.getAbout();
        //then
        assertThat(result).isEqualTo("/index");
    }
}