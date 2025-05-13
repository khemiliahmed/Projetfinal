package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.PrmStucture;
import com.example.projetPfe.services.PrmStuctureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/structures")
@CrossOrigin(origins = "*")
public class PrmStuctureController {

    private final PrmStuctureService prmStuctureService;

    public PrmStuctureController(PrmStuctureService prmStuctureService) {
        this.prmStuctureService = prmStuctureService;
    }

    @GetMapping
    public List<PrmStucture> getAllStuctures() {
        return prmStuctureService.getAllStuctures();
    }
}
