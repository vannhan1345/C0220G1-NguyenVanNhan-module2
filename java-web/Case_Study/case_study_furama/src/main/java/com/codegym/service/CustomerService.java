package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByNameContaining(String name, Pageable pageable);

    List<Customer> findAll();

    //    Page<Customer> findAllAndSortByName(Pageable pageable);
    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
