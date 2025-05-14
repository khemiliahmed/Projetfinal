package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhPoste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhPosteRepository extends JpaRepository<GrhPoste, Integer> {
}
