package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhGrillessalaire;
import com.example.projetPfe.services.GrhGrillessalaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grillessalaires")
@CrossOrigin(origins = "*")
public class GrhGrillessalaireController {

    private final GrhGrillessalaireService service;

    public GrhGrillessalaireController(GrhGrillessalaireService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhGrillessalaire> getAllGrillessalaires() {
        return service.getAllGrillessalaires();
    }
}
