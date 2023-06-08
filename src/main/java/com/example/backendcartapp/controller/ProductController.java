package com.example.backendcartapp.controller;

import com.example.backendcartapp.model.Product;
import com.example.backendcartapp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://cart-app-red.vercel.app")
public class ProductController {

    @Autowired
    private ProductServices service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.findAll();
    }

}
