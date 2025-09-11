package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ProductController {
    @RequestMapping(value="", method= RequestMethod.GET)
    public String findProduct(){
        // 객체 직접 생성 및 주입. IoC와 DI가 구현되지 않은 상태
        ProductService productService = new ProductService();
        return productService.findProduct();
    }
}
