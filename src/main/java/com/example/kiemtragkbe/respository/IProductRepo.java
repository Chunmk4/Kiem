package com.example.kiemtragkbe.respository;

import com.example.kiemtragkbe.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
