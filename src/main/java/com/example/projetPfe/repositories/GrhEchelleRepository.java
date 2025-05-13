package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhEchelle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhEchelleRepository extends JpaRepository<GrhEchelle, Integer> {
}
