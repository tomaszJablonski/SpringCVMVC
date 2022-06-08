package com.example.proba.controller;

import com.example.proba.model.Experience;
import com.example.proba.service.ExperienceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class ExperienceController {

    private final ExperienceService experienceService;

    @GetMapping("/experience")
    public String getAllExperience(Model model) {
        List<Experience> experienceList = experienceService.getAllExperience();
        model.addAttribute("experience", experienceList);
        return "/experience/experience";
    }

    @GetMapping("/addExperience")
    public String getAddExperience(){
        return "/experience/addExperience";
    }

    @PostMapping("/addExperience")
    public RedirectView postAddExperience(@Valid Experience experience){
        experienceService.addNewExperience(experience);
        return new RedirectView("/experience");
    }

    @GetMapping("/editExperience/{id}")
    public String getEditExperience(@PathVariable Long id, Model model){
        Experience experienceById = experienceService.getExperienceById(id);
        model.addAttribute("experience",experienceById);
        return "/experience/editExperience";
    }

    @PostMapping("/editExperience/{id}")
    public RedirectView postEditExperience(@Valid Experience experience, @PathVariable Long id){
        experienceService.editExperience(experience);
        return new RedirectView("/experience");
    }

    @PostMapping("/deleteExperience/{id}")
    public RedirectView deleteExperience(@PathVariable Long id ){
        experienceService.deleteExperience(id);
        return new RedirectView("/experience");
    }

}
