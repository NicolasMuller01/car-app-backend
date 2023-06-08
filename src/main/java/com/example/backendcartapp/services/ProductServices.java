package com.example.backendcartapp.services;

import com.example.backendcartapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface ProductServices {

    List<Product> findAll();

}
