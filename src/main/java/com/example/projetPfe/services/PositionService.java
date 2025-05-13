package com.example.projetPfe.services;

import com.example.projetPfe.entities.GrhPosition;
import com.example.projetPfe.repositories.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public List<GrhPosition> getAllPositions() {
        return positionRepository.findAll();
    }
}
