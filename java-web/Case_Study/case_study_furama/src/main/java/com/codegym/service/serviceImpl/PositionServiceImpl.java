package com.codegym.service.serviceImpl;

import com.codegym.model.Position;
import com.codegym.repository.PositionRepository;
import com.codegym.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public void save(Position position) {
        positionRepository.save(position);
    }
}
