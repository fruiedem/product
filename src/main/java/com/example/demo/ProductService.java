package com.example.demo;

import org.springframework.stereotype.Service;

// 스프링 빈으로 등록하기 (@Serivce 내부 @Component 애너테이션 확인)
@Service
public class ProductService {
    public String findProduct() {
        return "Notebook!";
    }
}
