package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhGrillessalaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhGrillessalaireRepository extends JpaRepository<GrhGrillessalaire, Integer> {
}
