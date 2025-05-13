package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhDegreshandicap;
import com.example.projetPfe.services.GrhDegreshandicapService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/degreshandicaps")
@CrossOrigin(origins = "*")
public class GrhDegreshandicapController {

    private final GrhDegreshandicapService service;

    public GrhDegreshandicapController(GrhDegreshandicapService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhDegreshandicap> getAllDegreshandicaps() {
        return service.getAllDegreshandicaps();
    }
}
