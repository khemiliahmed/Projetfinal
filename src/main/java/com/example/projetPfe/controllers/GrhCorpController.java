package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhCorp;
import com.example.projetPfe.services.GrhCorpService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corps")
@CrossOrigin(origins = "*")
public class GrhCorpController {

    private final GrhCorpService service;

    public GrhCorpController(GrhCorpService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhCorp> getAllCorps() {
        return service.getAllCorps();
    }
}
