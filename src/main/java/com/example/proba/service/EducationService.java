package com.example.proba.service;

import com.example.proba.model.Education;
import com.example.proba.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }


    public void addNewSchool(Education education) {
        educationRepository.save(education);
    }

    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    public Education getEducationById(Long id){
        return educationRepository.findById(id).orElse(null);
    }

    public void editEducation(Education education) {
        educationRepository.save(education);
    }

    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }


}
