package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhFonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhFonctionRepository extends JpaRepository<GrhFonction, Integer> {
}
