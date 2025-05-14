package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrhGradeRepository extends JpaRepository<GrhGrade, Integer> {
}
