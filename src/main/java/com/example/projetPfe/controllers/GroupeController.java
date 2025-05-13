package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhGroupe;
import com.example.projetPfe.services.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groupes")
public class GroupeController {

    @Autowired
    private GroupeService groupeService;

    @GetMapping
    public List<GrhGroupe> getAllGroupes() {
        return groupeService.getAllGroupes();
    }
}
