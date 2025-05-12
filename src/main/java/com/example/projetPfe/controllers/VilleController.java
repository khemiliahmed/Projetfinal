package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.PrmVille;
import com.example.projetPfe.services.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/villes")
public class VilleController {

    @Autowired
    private VilleService villeService;

    @GetMapping
    public List<PrmVille> getAllVilles() {
        return villeService.getAllVilles();
    }
}
