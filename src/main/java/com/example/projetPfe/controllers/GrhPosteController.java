package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhPoste;
import com.example.projetPfe.services.GrhPosteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/postes")
public class GrhPosteController {

    private final GrhPosteService service;

    public GrhPosteController(GrhPosteService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhPoste> getAllPostes() {
        return service.getAllPostes();
    }
}
