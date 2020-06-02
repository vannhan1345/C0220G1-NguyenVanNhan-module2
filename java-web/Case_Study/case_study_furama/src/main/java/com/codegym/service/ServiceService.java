package com.codegym.service;


import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ServiceService {
    Page<Service> findAll(Pageable pageable);

    Page<Service> findAllByNameContaining(String name, Pageable pageable);

    Service findById(Long id);

    List<Service> findAll();

    void save(Service service);

    void remove(Long id);
}
