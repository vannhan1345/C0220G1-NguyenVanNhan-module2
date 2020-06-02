package com.codegym.service;

import com.codegym.model.Employee;
import com.codegym.model.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findAllByNameContaining(String name, Pageable pageable);

    Employee findById(Long id);

    void save(Employee employee);

    List<Employee> findAll();

    void remove(Long id);
}
