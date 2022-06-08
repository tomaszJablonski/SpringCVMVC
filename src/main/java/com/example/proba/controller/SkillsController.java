package com.example.proba.controller;

import com.example.proba.model.Skill;
import com.example.proba.service.SkillsService;
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
@Valid
public class SkillsController {

    private final SkillsService skillsService;

    @GetMapping("/skills")
    public String getSkills(Model model) {
        List<Skill> skillList = skillsService.getAllSkills();
        model.addAttribute("talents", skillList);
        return "/skills/skills";
    }

    @GetMapping("/addSkill")
    public String getAddSkill() {
        return "/skills/addSkill";
    }

    @PostMapping("/addSkill")
    public RedirectView postAddSkill(@Valid Skill skill) {
        skillsService.addSkill(skill);
        return new RedirectView("/skills");
    }

    @GetMapping("/editSkill/{id}")
    public String getEditSkill(@PathVariable Long id, Model model) {
        Skill skillById = skillsService.getSkillById(id);
        model.addAttribute("skill", skillById);
        return "/skills/editSkill";
    }


    @PostMapping("/editSkill/{id}")
    public RedirectView postEditSkill(@PathVariable Long id, Skill skill) {
        skillsService.editSkill(skill);
        return new RedirectView("/skills");
    }

    @PostMapping("/deleteSkill/{id}")
    public RedirectView deleteSkill(@PathVariable Long id) {
        skillsService.deleteSkill(id);
        return new RedirectView("/skills");
    }

}

