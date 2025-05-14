package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhPoste;
import com.example.projetPfe.repositories.GrhPosteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhPosteService {

    private final GrhPosteRepository repository;

    public GrhPosteService(GrhPosteRepository repository) {
        this.repository = repository;
    }

    public List<GrhPoste> getAllPostes() {
        return repository.findAll();
    }
}
