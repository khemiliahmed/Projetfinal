package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhGrade;
import com.example.projetPfe.repositories.GrhGradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhGradeService {

    private final GrhGradeRepository repository;

    public GrhGradeService(GrhGradeRepository repository) {
        this.repository = repository;
    }

    public List<GrhGrade> getAllGrades() {
        return repository.findAll();
    }
}
