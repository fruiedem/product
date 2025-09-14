package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 스프링 빈으로 등록하기 (@Serivce 내부 @Component 애너테이션 확인) -> @Autowired 를 사용하지 않으면 사용X
@Service
public class ProductService {
    // 생성자 주입하여 DI 구현 방법  
    private ProductRepository productRepository;
    @Autowired
    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public String findProduct() {
        return productRepository.findProduct();
    }
    public void saveProduct() {
        productRepository.save();
    }
}
