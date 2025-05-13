package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhRegimestravail;
import com.example.projetPfe.repositories.RegimesTravailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegimesTravailService {

    private final RegimesTravailRepository regimesTravailRepository;

    public RegimesTravailService(RegimesTravailRepository regimesTravailRepository) {
        this.regimesTravailRepository = regimesTravailRepository;
    }

    public List<GrhRegimestravail> getAllRegimesTravail() {
        return regimesTravailRepository.findAll();
    }
}
