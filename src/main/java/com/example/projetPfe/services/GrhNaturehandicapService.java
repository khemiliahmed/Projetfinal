package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhNaturehandicap;
import com.example.projetPfe.repositories.GrhNaturehandicapRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhNaturehandicapService {

    private final GrhNaturehandicapRepository repository;

    public GrhNaturehandicapService(GrhNaturehandicapRepository repository) {
        this.repository = repository;
    }

    public List<GrhNaturehandicap> getAllNatureHandicaps() {
        return repository.findAll();
    }
}
