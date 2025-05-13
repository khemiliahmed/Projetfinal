package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhNaturehandicap;
import com.example.projetPfe.services.GrhNaturehandicapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/naturehandicaps")
@CrossOrigin(origins = "*")
public class GrhNaturehandicapController {

    private final GrhNaturehandicapService service;

    public GrhNaturehandicapController(GrhNaturehandicapService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhNaturehandicap> getAllNatureHandicaps() {
        return service.getAllNatureHandicaps();
    }
}
