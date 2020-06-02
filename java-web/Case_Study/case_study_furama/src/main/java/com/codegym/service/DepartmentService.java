package com.codegym.service;

import com.codegym.model.Department;
import com.codegym.model.TypeService;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    void save(Department department);
}
