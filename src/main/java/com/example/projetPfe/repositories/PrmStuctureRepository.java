package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.PrmStucture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrmStuctureRepository extends JpaRepository<PrmStucture, Integer> {
}
