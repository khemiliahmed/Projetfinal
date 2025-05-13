package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhPosition;
import com.example.projetPfe.services.PositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/positions")
@CrossOrigin(origins = "*")
public class PositionController {

    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping
    public List<GrhPosition> getAllPositions() {
        return positionService.getAllPositions();
    }
}
