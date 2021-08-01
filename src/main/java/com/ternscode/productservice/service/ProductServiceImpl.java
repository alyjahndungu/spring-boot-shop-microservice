package com.ternscode.productservice.service;

import com.ternscode.productservice.model.Products;
import com.ternscode.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void addProduct(Products products){
     productRepository.save(products);
    }

    @Override
    public List<Products> showProducts(){
        return productRepository.findAll();
    }

}
