package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhSoupo;
import com.example.projetPfe.repositories.SoupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoupoService {

    private final SoupoRepository soupoRepository;

    public SoupoService(SoupoRepository soupoRepository) {
        this.soupoRepository = soupoRepository;
    }

    public List<GrhSoupo> getAllSoupas() {
        return soupoRepository.findAll();
    }
}
