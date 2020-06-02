package com.codegym.service.serviceImpl;

import com.codegym.model.TypeCustomer;
import com.codegym.model.TypeService;
import com.codegym.repository.TypeServiceRepository;
import com.codegym.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeServiceService {
    @Autowired
    TypeServiceRepository typeServiceRepository;

    @Override
    public List<TypeService> findAll() {
        return typeServiceRepository.findAll();
    }

    @Override
    public void save(TypeService typeService) {
        typeServiceRepository.save(typeService);
    }
}
