package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhCorp;
import com.example.projetPfe.repositories.GrhCorpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhCorpService {

    private final GrhCorpRepository repository;

    public GrhCorpService(GrhCorpRepository repository) {
        this.repository = repository;
    }

    public List<GrhCorp> getAllCorps() {
        return repository.findAll();
    }
}
