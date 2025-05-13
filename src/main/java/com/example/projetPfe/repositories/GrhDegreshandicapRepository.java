package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhDegreshandicap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhDegreshandicapRepository extends JpaRepository<GrhDegreshandicap, Integer> {
}
