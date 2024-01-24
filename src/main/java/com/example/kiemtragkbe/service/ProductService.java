package com.example.kiemtragkbe.service;

import com.example.kiemtragkbe.model.Product;
import com.example.kiemtragkbe.respository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
@Autowired
private IProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();

    }

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }


    @Override
    public void remove(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void edit(Product product) {
        productRepo.save(product);
    }

    @Override
    public Optional<Product> findById(int id) {
      return productRepo.findById(id);
    }
}
