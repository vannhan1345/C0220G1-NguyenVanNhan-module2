package com.codegym.service.serviceImpl;

import com.codegym.model.AccompanyingService;
import com.codegym.repository.AccompanyingServiceRepository;
import com.codegym.service.AccompanyingServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccompanyingServiceImpl implements AccompanyingServiceService {
    @Autowired
    AccompanyingServiceRepository accompanyingServiceRepository;

    @Override
    public List<AccompanyingService> findAll() {
        return accompanyingServiceRepository.findAll();
    }

    @Override
    public void save(AccompanyingService accompanyingService) {
        accompanyingServiceRepository.save(accompanyingService);
    }
}
