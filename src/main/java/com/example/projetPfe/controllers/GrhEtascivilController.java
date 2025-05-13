package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhEtascivil;
import com.example.projetPfe.services.GrhEtascivilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etatscivils")
@CrossOrigin(origins = "*")
public class GrhEtascivilController {

    private final GrhEtascivilService grhEtascivilService;

    public GrhEtascivilController(GrhEtascivilService grhEtascivilService) {
        this.grhEtascivilService = grhEtascivilService;
    }

    @GetMapping
    public List<GrhEtascivil> getAllEtatsCivils() {
        return grhEtascivilService.getAllEtatsCivils();
    }
}
