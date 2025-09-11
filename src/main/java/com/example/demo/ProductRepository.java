package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public String findProduct()
    {
        return "Notebook!!!";
    }
}
