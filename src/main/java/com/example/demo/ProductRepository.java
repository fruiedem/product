package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, Product> db = new HashMap<>();
    private Integer id = 1;
    public Product findProduct(int id) {
        return db.get(id);
    }
    public void save(Product product){
        db.put(id++, product);
    }
}
