package com.example.proba.controller.Skills;

import com.example.proba.model.Skills.Workflow;
import com.example.proba.service.Skills.WorkflowService;
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
public class WorkflowController {

    private final WorkflowService workflowService;

    @GetMapping("/skills")
    public String getWorkflow(Model model){
        List<Workflow> workflowList = workflowService.getAllWorkflow();
        model.addAttribute("workflow",workflowList);
        return "/skills/skillsAndWorkflow";
    }

    @GetMapping("/addWorkflow")
    public String getAddWorkflow(){
        return "/skills/workflow/addWorkflow";
    }

    @PostMapping("/addWorkflow")
    public RedirectView postAddWorkflow(@Valid Workflow workflow){
        workflowService.addWorkflow(workflow);
        return new RedirectView("/skills");
    }

    @GetMapping("/editWorkflow/{id}")
    public String getEditWorkflow(@PathVariable Long id, Model model){
        Workflow workflowById = workflowService.getWorkflowById(id);
        model.addAttribute("workflow", workflowById);
        return "/skills/workflow/editWorkflow";
    }


    @PostMapping("/editWorkflow/{id}")
    public RedirectView postEditWorkflow(Workflow workflow, @PathVariable Long id){
        workflowService.editWorkflow(workflow);
        return new RedirectView("/skills");
    }

    @PostMapping("/deleteWorkflow/{id}")
    public RedirectView deleteWorkflow(@PathVariable Long id ){
        workflowService.deleteWorkflow(id);
        return new RedirectView("/skills");
    }

}
