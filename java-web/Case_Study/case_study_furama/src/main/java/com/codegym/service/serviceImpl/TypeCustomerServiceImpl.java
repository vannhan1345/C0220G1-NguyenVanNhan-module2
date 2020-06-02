package com.codegym.service.serviceImpl;

import com.codegym.model.TypeCustomer;
import com.codegym.repository.TypeCustomerRepository;
import com.codegym.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    TypeCustomerRepository typeCustomerRepository;

    @Override
    public List<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
        typeCustomerRepository.save(typeCustomer);
    }
}
