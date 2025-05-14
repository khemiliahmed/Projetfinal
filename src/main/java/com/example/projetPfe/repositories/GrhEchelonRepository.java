package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhEchelon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhEchelonRepository extends JpaRepository<GrhEchelon, Integer> {
}
