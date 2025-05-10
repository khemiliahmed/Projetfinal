package com.example.projetPfe.repositories;

import com.example.projetPfe.entities.GrhEmploye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<GrhEmploye, Long> {
    GrhEmploye findByEmpyCod(String empyCod);
}
