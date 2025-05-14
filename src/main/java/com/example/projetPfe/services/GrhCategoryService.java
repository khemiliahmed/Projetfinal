package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhCategory;
import com.example.projetPfe.repositories.GrhCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrhCategoryService {

    private final GrhCategoryRepository repository;

    public GrhCategoryService(GrhCategoryRepository repository) {
        this.repository = repository;
    }

    public List<GrhCategory> getAllCategories() {
        return repository.findAll();
    }
}
