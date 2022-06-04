package com.example.proba.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String getIndex(){
        return "/index";
    }

    @GetMapping("/index")
    public String getAbout(){
        return "/index";
    }

}
