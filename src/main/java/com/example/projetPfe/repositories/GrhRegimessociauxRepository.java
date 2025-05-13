package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhRegimessociaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhRegimessociauxRepository extends JpaRepository<GrhRegimessociaux, Integer> {
}
