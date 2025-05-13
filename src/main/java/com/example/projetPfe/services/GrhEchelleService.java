package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhEchelle;
import com.example.projetPfe.repositories.GrhEchelleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhEchelleService {

    private final GrhEchelleRepository repository;

    public GrhEchelleService(GrhEchelleRepository repository) {
        this.repository = repository;
    }

    public List<GrhEchelle> getAllEchelles() {
        return repository.findAll();
    }
}
