package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<GrhPosition, Integer> {
}
