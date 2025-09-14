package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, String> db = new HashMap<>();
    private Integer id = 1;
    public String findProduct(int id)
    {
        return db.get(id);
    }
    public void save(String productName){
        db.put(id++, productName);
    }
}
