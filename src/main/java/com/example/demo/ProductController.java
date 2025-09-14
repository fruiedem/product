package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {

    //등록된 빈을 사용하기
    @Autowired
    private ProductService productService;  // 특정 메소드 내에서만 사용할 것이 아니므로 필드로 선언
    @RequestMapping(value="/products", method= RequestMethod.GET)
    public String findProduct(){
        // 객체 직접 생성 및 주입. IoC와 DI가 구현되지 않은 상태
        // ProductService productService = new ProductService();
        return productService.findProduct();
    }

    @RequestMapping(value="/products", method=RequestMethod.POST)
    public void saveProduct(){
        productService.saveProduct();
    }
}
