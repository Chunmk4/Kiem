package com.example.kiemtragkbe.service;

import com.example.kiemtragkbe.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> findAll();
    Optional<Product> findById(int id);

    public void edit(Product product);
    void save(Product product);
    void remove(int id);


}
