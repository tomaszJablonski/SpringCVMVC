package com.example.proba.service.Skills;

import com.example.proba.model.Skills.Workflow;
import com.example.proba.repository.skills.WorkflowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkflowService {

    private final WorkflowRepository workflowRepository;

    public List<Workflow> getAllWorkflow() {
        return workflowRepository.findAll();
    }

    public void addWorkflow(Workflow workflow) {
        workflowRepository.save(workflow);
    }

    public void editWorkflow(Workflow workflow) {
        workflowRepository.save(workflow);
    }

    public Workflow getWorkflowById(Long id) {
        return workflowRepository.findById(id).orElse(null);
    }

    public void deleteWorkflow(Long id) {
        workflowRepository.deleteById(id);
    }








}
