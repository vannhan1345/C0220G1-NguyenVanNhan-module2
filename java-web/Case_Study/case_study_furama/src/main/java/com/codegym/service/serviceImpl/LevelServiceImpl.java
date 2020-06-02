package com.codegym.service.serviceImpl;

import com.codegym.model.Level;
import com.codegym.repository.LevelRepository;
import com.codegym.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelRepository levelRepository;

    @Override
    public List<Level> findAll() {
        return levelRepository.findAll();
    }

    @Override
    public void save(Level level) {
        levelRepository.save(level);
    }
}
