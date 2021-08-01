package com.ternscode.productservice.service;

import com.ternscode.productservice.model.Products;

import java.util.List;

public interface ProductService {

    void addProduct(Products products);

    List<Products> showProducts();

}
