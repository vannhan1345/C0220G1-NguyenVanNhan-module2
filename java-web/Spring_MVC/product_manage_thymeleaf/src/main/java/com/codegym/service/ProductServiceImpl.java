package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> products;

    static {
        products= new HashMap<>();
        products.put(1,new Product(1,"Kem chien","15000","Ho Chi Minh"));
        products.put(2,new Product(2,"Kem cuon","20000","Da nang"));
        products.put(3,new Product(3,"Kem dat vang","150000","Ho Chi Minh"));
        products.put(4,new Product(4,"Kem mochi","10000","Quang Nam"));
        products.put(5,new Product(5,"Kem tra sua","60000","Ho Chi Minh"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
