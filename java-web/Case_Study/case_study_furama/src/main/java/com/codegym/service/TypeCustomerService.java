package com.codegym.service;

import com.codegym.model.TypeCustomer;

import java.util.List;

public interface TypeCustomerService {
    List<TypeCustomer> findAll();
    void save(TypeCustomer typeCustomer);
}
