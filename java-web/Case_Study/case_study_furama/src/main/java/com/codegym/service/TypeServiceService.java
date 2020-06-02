package com.codegym.service;

import com.codegym.model.TypeCustomer;
import com.codegym.model.TypeService;

import java.util.List;

public interface TypeServiceService {
    List<TypeService> findAll();
    void save(TypeService typeService);
}
