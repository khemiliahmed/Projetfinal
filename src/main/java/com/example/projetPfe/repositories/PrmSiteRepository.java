package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.PrmSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrmSiteRepository extends JpaRepository<PrmSite, Integer> {
}
