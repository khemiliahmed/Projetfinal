package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhRegimessociaux;
import com.example.projetPfe.repositories.GrhRegimessociauxRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhRegimessociauxService {

    private final GrhRegimessociauxRepository repository;

    public GrhRegimessociauxService(GrhRegimessociauxRepository repository) {
        this.repository = repository;
    }

    public List<GrhRegimessociaux> getAllRegimesSociaux() {
        return repository.findAll();
    }
}
