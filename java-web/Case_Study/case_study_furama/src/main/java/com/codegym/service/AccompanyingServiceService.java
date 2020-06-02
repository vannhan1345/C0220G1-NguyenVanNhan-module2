package com.codegym.service;

import com.codegym.model.AccompanyingService;
import com.codegym.model.TypeRent;

import java.util.List;

public interface AccompanyingServiceService {
    List<AccompanyingService> findAll();
    void save(AccompanyingService accompanyingService);
}
