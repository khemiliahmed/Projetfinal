package com.example.projetPfe.services;



import com.example.projetPfe.entities.GrhEmploye;
import com.example.projetPfe.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GrhEmployeService {
    
    @Autowired
    private EmployeRepository employeRepository;
    
    public List<GrhEmploye> getAllEmployes() {
        return employeRepository.findAll();
    }
    
    public GrhEmploye getEmployeById(Long empyUid) {
        return employeRepository.findById(empyUid).orElse(null);
    }
    
    public GrhEmploye getEmployeByCode(String empyCod) {
        return employeRepository.findByEmpyCod(empyCod);
    }
    
    public GrhEmploye saveEmploye(GrhEmploye employe) {
        return employeRepository.save(employe);
    }
    
    public void deleteEmploye(Long empyUid) {
        employeRepository.deleteById(empyUid);
    }
}