package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhGroupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends JpaRepository<GrhGroupe, Long> {
}
