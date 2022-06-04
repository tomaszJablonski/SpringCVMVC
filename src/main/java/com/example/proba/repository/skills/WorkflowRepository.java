package com.example.proba.repository.skills;

import com.example.proba.model.Skills.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface WorkflowRepository extends JpaRepository<Workflow,Long> {
}
