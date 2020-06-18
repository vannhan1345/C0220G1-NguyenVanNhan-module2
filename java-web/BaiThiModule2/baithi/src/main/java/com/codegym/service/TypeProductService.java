package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.model.TypeProduct;

import java.util.List;

public interface TypeProductService {


    List<TypeProduct> findAll();

    TypeProduct findById(Long id);

    void save(TypeProduct typeProduct);

    void remove(Long id);

}
