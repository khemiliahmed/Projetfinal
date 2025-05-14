package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhCategoryRepository extends JpaRepository<GrhCategory, Integer> {
}
