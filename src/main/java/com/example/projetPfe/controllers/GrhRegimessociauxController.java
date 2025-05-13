package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhRegimessociaux;
import com.example.projetPfe.services.GrhRegimessociauxService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regimessociaux")
@CrossOrigin(origins = "*")
public class GrhRegimessociauxController {

    private final GrhRegimessociauxService service;

    public GrhRegimessociauxController(GrhRegimessociauxService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhRegimessociaux> getAllRegimesSociaux() {
        return service.getAllRegimesSociaux();
    }
}
