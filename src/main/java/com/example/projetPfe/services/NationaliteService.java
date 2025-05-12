package com.example.projetPfe.services;

import com.example.projetPfe.entities.PrmNationalite;
import com.example.projetPfe.repositories.PrmNationaliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationaliteService {

    @Autowired
    private PrmNationaliteRepository nationaliteRepository;

    public List<PrmNationalite> getAllNationalites() {
        return nationaliteRepository.findAll();
    }
}