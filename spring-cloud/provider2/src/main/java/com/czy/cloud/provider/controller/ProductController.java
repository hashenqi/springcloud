package com.czy.cloud.provider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/getId")
    public String productId(){
        return "pro2";
    }
}
