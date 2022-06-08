package com.example.proba.service;

import com.example.proba.model.Interests;
import com.example.proba.repository.InterestsRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Getter
@Setter

public class InterestsService {

    private InterestsRepository interestsRepository;

    public List<Interests> getInterestsDescription() {
        return interestsRepository.findAll();
    }

    public void addInterestsDescription(Interests interests) {
        interestsRepository.save(interests);
    }

    public void editInterestsDescription(Interests interests) {
        interestsRepository.save(interests);
    }

    public Interests getInterestsById(Long id) {
        return interestsRepository.findById(id).orElse(null);
    }

    public void deleteInterestsDescription(Long id) {
        interestsRepository.deleteById(id);
    }


}
