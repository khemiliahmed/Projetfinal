package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhCorp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhCorpRepository extends JpaRepository<GrhCorp, Integer> {
}
