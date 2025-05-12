package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.PrmNationalite;
import com.example.projetPfe.services.NationaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nationalites")
public class NationaliteController {

    @Autowired
    private NationaliteService nationaliteService;

    @GetMapping
    public List<PrmNationalite> getAllNationalites() {
        return nationaliteService.getAllNationalites();
    }
}