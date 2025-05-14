package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhFonction;
import com.example.projetPfe.repositories.GrhFonctionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhFonctionService {

    private final GrhFonctionRepository repository;

    public GrhFonctionService(GrhFonctionRepository repository) {
        this.repository = repository;
    }

    public List<GrhFonction> getAllFonctions() {
        return repository.findAll();
    }
}
