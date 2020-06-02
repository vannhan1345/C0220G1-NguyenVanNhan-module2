package com.codegym.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Cart {
    private Map<String, Optional<Product>> listProduct = new HashMap<>(10);
    private int total = 0;
    private int count = 0;
    private int countProduct=0;

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

    public Cart() {
    }

    public Map<String, Optional<Product>> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Map<String, Optional<Product>> listProduct) {
        this.listProduct = listProduct;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addProduct(Optional<Product> product) {
        listProduct.put(product.get().name, product);
        count++;
    }

    public void sumMoney() {
        for (Map.Entry<String, Optional<Product>> entry : listProduct.entrySet()) {
            total += (entry.getValue().get().price * entry.getValue().get().amount);
        }
    }
    public void sumProduct() {
        for (Map.Entry<String, Optional<Product>> entry : listProduct.entrySet()) {
            countProduct += ( entry.getValue().get().amount);
        }
    }
}
