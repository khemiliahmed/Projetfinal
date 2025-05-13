package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhNaturehandicap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhNaturehandicapRepository extends JpaRepository<GrhNaturehandicap, Integer> {
}
