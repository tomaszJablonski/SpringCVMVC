package com.example.proba.controller;

import com.example.proba.model.Interests;
import com.example.proba.service.InterestsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class InterestsController {

    private InterestsService interestsService;

    public InterestsController(InterestsService interestsService) {
        this.interestsService = interestsService;
    }

    @GetMapping("/interests")
    public String getInterests(Model model) {
        List<Interests> interestsList = interestsService.getInterestsDescription();
        model.addAttribute("interests", interestsList);
        return "/interests/interests";
    }

    @GetMapping("/addInterestsDescription")
    public String getAddInterestsDescription() {
        return "/interests/addInterestsDescription";
    }

    @PostMapping("/addInterestsDescription")
    public RedirectView postAddInterestsDescription(@Valid Interests interests) {
        interestsService.addInterestsDescription(interests);
        return new RedirectView("/interests");
    }

    @GetMapping("/editInterestsDescription/{id}")
    public String getEditInterestsDescription(@PathVariable Long id, Model model) {
        Interests interestsById = interestsService.getInterestsByid(id);
        model.addAttribute("interests", interestsById);
        return "/interests/editInterestsDescription";
    }

    @PostMapping("/editInterestsDescription/{id}")
    public RedirectView postEditInterestsDescription(@Valid Interests interests) {
        interestsService.editInterestsDescription(interests);
        return new RedirectView("/interests");
    }

    @PostMapping("/deleteInterests/{id}")
    public RedirectView deleteInterests(@PathVariable Long id) {
        interestsService.deleteInterestsDescription(id);
        return new RedirectView("/interests");
    }
}
