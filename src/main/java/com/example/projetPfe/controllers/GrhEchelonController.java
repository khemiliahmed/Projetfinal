package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhEchelon;
import com.example.projetPfe.services.GrhEchelonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/echelons")
public class GrhEchelonController {

    private final GrhEchelonService service;

    public GrhEchelonController(GrhEchelonService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhEchelon> getAllEchelons() {
        return service.getAllEchelons();
    }
}
