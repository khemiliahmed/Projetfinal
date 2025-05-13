package com.example.projetPfe.services;

import com.example.projetPfe.entities.PrmStucture;
import com.example.projetPfe.repositories.PrmStuctureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrmStuctureService {

    private final PrmStuctureRepository prmStuctureRepository;

    public PrmStuctureService(PrmStuctureRepository prmStuctureRepository) {
        this.prmStuctureRepository = prmStuctureRepository;
    }

    public List<PrmStucture> getAllStuctures() {
        return prmStuctureRepository.findAll();
    }
}
