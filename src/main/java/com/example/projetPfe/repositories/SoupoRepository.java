package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhSoupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoupoRepository extends JpaRepository<GrhSoupo, Integer> {
}
