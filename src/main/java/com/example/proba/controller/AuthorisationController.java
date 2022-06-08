package com.example.proba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorisationController {

    @GetMapping("/login")
    public String getLogin() {
        return "auth/login";
    }

}
