package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhSoupo;
import com.example.projetPfe.services.SoupoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soupos")
@CrossOrigin(origins = "*")
public class SoupoController {

    private final SoupoService soupoService;

    public SoupoController(SoupoService soupoService) {
        this.soupoService = soupoService;
    }

    @GetMapping
    public List<GrhSoupo> getAllSoupas() {
        return soupoService.getAllSoupas();
    }
}
