package com.example.projetPfe.controllers;

import com.example.projetPfe.entities.GrhCategory;
import com.example.projetPfe.services.GrhCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class GrhCategoryController {

    private final GrhCategoryService service;

    public GrhCategoryController(GrhCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<GrhCategory> getAllCategories() {
        return service.getAllCategories();
    }
}
