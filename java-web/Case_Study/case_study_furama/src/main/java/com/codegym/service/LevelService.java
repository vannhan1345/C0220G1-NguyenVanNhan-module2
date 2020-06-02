package com.codegym.service;

import com.codegym.model.Level;
import com.codegym.model.TypeService;

import java.util.List;

public interface LevelService {
    List<Level> findAll();
    void save(Level level);
}
