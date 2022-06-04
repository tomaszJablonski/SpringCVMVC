package com.example.proba.service;

import com.example.proba.model.Experience;
import com.example.proba.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    private ExperienceRepository experienceRepository;

    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }


    public void addNewExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    public List<Experience> getAllExperience() {
        return experienceRepository.findAll();
    }

    public Experience getExperienceById(Long id) {
        return experienceRepository.findById(id).orElse(null);
    }

    public void editExperience(Experience experience) {
        experienceRepository.save(experience);
    }

    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }


}
