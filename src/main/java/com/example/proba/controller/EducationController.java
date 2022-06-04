package com.example.proba.controller;

import com.example.proba.model.Education;
import com.example.proba.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/education")
    public String getEducation(Model model) {
        List<Education> educationList = educationService.getAllEducations();
        model.addAttribute("education",educationList);
        return "/education/education";
    }

    @GetMapping("/addEducation")
    public String getAddEducation(){
        return "/education/addEducation";
    }

    @PostMapping("/addEducation")
    public RedirectView postAddEducation(@Valid Education education){
        educationService.addNewSchool(education);
        return new RedirectView("/education");
    }

    @GetMapping("/editEducation/{id}")
    public String getEditEducation(@PathVariable Long id, Model model){
        Education educationById = educationService.getEducationById(id);
        model.addAttribute("education",educationById);
        return "/education/editEducation";
    }

    @PostMapping("/editEducation/{id}")
    public RedirectView postEditEducation(@Valid Education education, @PathVariable Long id){
        educationService.editEducation(education);
        return new RedirectView("/education");
    }

    @PostMapping("/deleteEducation/{id}")
    public RedirectView deleteEducation(@PathVariable Long id ){
        educationService.deleteEducation(id);
        return new RedirectView("/education");
    }




}

