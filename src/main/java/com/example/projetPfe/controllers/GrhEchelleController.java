package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhEchelle;
import com.example.projetPfe.services.GrhEchelleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/echelles")
@CrossOrigin(origins = "*")
public class GrhEchelleController {

    private final GrhEchelleService service;

    public GrhEchelleController(GrhEchelleService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhEchelle> getAllEchelles() {
        return service.getAllEchelles();
    }
}
