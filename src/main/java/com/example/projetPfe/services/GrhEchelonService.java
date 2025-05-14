package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhEchelon;
import com.example.projetPfe.repositories.GrhEchelonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhEchelonService {

    private final GrhEchelonRepository repository;

    public GrhEchelonService(GrhEchelonRepository repository) {
        this.repository = repository;
    }

    public List<GrhEchelon> getAllEchelons() {
        return repository.findAll();
    }
}
