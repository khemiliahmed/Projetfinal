package com.example.projetPfe.controllers;


import com.example.projetPfe.entities.GrhEmploye;
import com.example.projetPfe.services.GrhEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
@CrossOrigin("*")
public class GrhEmployeController {
    
    @Autowired
    private GrhEmployeService employeService;
    
    @GetMapping
    public List<GrhEmploye> getAllEmployes() {
        return employeService.getAllEmployes();
    }
    
    @GetMapping("/{empyUid}")
    public ResponseEntity<GrhEmploye> getEmployeById(@PathVariable Long empyUid) {
        GrhEmploye employe = employeService.getEmployeById(empyUid);
        return employe != null ? ResponseEntity.ok(employe) : ResponseEntity.notFound().build();
    }
    
    @GetMapping("/code/{empyCod}")
    public ResponseEntity<GrhEmploye> getEmployeByCode(@PathVariable String empyCod) {
        GrhEmploye employe = employeService.getEmployeByCode(empyCod);
        return employe != null ? ResponseEntity.ok(employe) : ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public GrhEmploye createEmploye(@RequestBody GrhEmploye employe) {
        return employeService.saveEmploye(employe);
    }
    
    @DeleteMapping("/{empyUid}")
    public ResponseEntity<Void> deleteEmploye(@PathVariable Long empyUid) {
        employeService.deleteEmploye(empyUid);
        return ResponseEntity.noContent().build();
    }
}