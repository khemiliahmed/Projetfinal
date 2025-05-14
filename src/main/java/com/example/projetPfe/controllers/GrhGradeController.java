package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhGrade;
import com.example.projetPfe.services.GrhGradeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GrhGradeController {

    private final GrhGradeService service;

    public GrhGradeController(GrhGradeService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhGrade> getAllGrades() {
        return service.getAllGrades();
    }
}
