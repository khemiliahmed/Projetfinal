package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhSpecialitesdiplome;
import com.example.projetPfe.repositories.GrhSpecialitesdiplomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhSpecialitesdiplomeService {

    private final GrhSpecialitesdiplomeRepository repository;

    public GrhSpecialitesdiplomeService(GrhSpecialitesdiplomeRepository repository) {
        this.repository = repository;
    }

    public List<GrhSpecialitesdiplome> getAllSpecialitesDiplomes() {
        return repository.findAll();
    }
}
