package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.PrmSite;
import com.example.projetPfe.services.PrmSiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sites")
@CrossOrigin(origins = "*")
public class PrmSiteController {

    private final PrmSiteService prmSiteService;

    public PrmSiteController(PrmSiteService prmSiteService) {
        this.prmSiteService = prmSiteService;
    }

    @GetMapping
    public List<PrmSite> getAllSites() {
        return prmSiteService.getAllSites();
    }
}
