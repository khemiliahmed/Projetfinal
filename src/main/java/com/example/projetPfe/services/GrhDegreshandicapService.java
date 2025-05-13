package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhDegreshandicap;
import com.example.projetPfe.repositories.GrhDegreshandicapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhDegreshandicapService {

    private final GrhDegreshandicapRepository repository;

    public GrhDegreshandicapService(GrhDegreshandicapRepository repository) {
        this.repository = repository;
    }

    public List<GrhDegreshandicap> getAllDegreshandicaps() {
        return repository.findAll();
    }
}
