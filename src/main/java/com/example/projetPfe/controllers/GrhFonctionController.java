package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhFonction;
import com.example.projetPfe.services.GrhFonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grhFonctions")
@CrossOrigin(origins = "*")
public class GrhFonctionController {

    private final GrhFonctionService service;

    @Autowired
    public GrhFonctionController(GrhFonctionService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhFonction> getAllFonctions() {
        return service.getAllFonctions();
    }
}
