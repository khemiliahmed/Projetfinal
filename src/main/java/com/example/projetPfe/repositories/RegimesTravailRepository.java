package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhRegimestravail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimesTravailRepository extends JpaRepository<GrhRegimestravail, Integer> {
}
