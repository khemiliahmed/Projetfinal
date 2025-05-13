package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhRegimestravail;
import com.example.projetPfe.services.RegimesTravailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regimes-travail")
@CrossOrigin(origins = "*")
public class RegimesTravailController {

    private final RegimesTravailService regimesTravailService;

    public RegimesTravailController(RegimesTravailService regimesTravailService) {
        this.regimesTravailService = regimesTravailService;
    }

    @GetMapping
    public List<GrhRegimestravail> getAllRegimesTravail() {
        return regimesTravailService.getAllRegimesTravail();
    }
}
