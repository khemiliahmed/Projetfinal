package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhSpecialitesdiplome;
import com.example.projetPfe.services.GrhSpecialitesdiplomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grhSpecialitesdiplomes")
@CrossOrigin(origins = "*")
public class GrhSpecialitesdiplomeController {

    private final GrhSpecialitesdiplomeService service;

    @Autowired
    public GrhSpecialitesdiplomeController(GrhSpecialitesdiplomeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhSpecialitesdiplome> getAllSpecialitesDiplomes() {
        return service.getAllSpecialitesDiplomes();
    }
}
