package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhEtascivil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhEtascivilRepository extends JpaRepository<GrhEtascivil, Integer> {
}
