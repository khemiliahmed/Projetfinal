package com.example.projetPfe.services;

import com.example.projetPfe.entities.PrmSite;
import com.example.projetPfe.repositories.PrmSiteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrmSiteService {

    private final PrmSiteRepository prmSiteRepository;

    public PrmSiteService(PrmSiteRepository prmSiteRepository) {
        this.prmSiteRepository = prmSiteRepository;
    }

    public List<PrmSite> getAllSites() {
        return prmSiteRepository.findAll();
    }
}
