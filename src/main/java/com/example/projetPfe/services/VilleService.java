package com.example.projetPfe.services;

import com.example.projetPfe.entities.PrmVille;
import com.example.projetPfe.repositories.PrmVilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {

    @Autowired
    private PrmVilleRepository villeRepository;

    public List<PrmVille> getAllVilles() {
        return villeRepository.findAll();
    }
}
