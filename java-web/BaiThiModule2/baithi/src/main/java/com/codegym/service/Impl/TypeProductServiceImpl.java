package com.codegym.service.Impl;

import com.codegym.model.TypeProduct;
import com.codegym.repository.TypeProductRepository;
import com.codegym.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeProductServiceImpl implements TypeProductService {
    @Autowired
    TypeProductRepository typeProductRepository;

    @Override
    public List<TypeProduct> findAll() {
        return typeProductRepository.findAll();
    }

    @Override
    public TypeProduct findById(Long id) {
        return typeProductRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeProduct typeProduct) {
        typeProductRepository.save(typeProduct);
    }

    @Override
    public void remove(Long id) {
        typeProductRepository.deleteById(id);
    }
}
