package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhEtascivil;
import com.example.projetPfe.repositories.GrhEtascivilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhEtascivilService {

    private final GrhEtascivilRepository grhEtascivilRepository;

    public GrhEtascivilService(GrhEtascivilRepository grhEtascivilRepository) {
        this.grhEtascivilRepository = grhEtascivilRepository;
    }

    public List<GrhEtascivil> getAllEtatsCivils() {
        return grhEtascivilRepository.findAll();
    }
}
