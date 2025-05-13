package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhGroupe;
import com.example.projetPfe.repositories.GrhGroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeService {

    @Autowired
    private GrhGroupeRepository groupeRepository;

    public List<GrhGroupe> getAllGroupes() {
        return groupeRepository.findAll();
    }
}
