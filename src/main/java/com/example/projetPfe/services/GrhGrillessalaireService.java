package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhGrillessalaire;
import com.example.projetPfe.repositories.GrhGrillessalaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhGrillessalaireService {

    private final GrhGrillessalaireRepository repository;

    public GrhGrillessalaireService(GrhGrillessalaireRepository repository) {
        this.repository = repository;
    }

    public List<GrhGrillessalaire> getAllGrillessalaires() {
        return repository.findAll();
    }
}
