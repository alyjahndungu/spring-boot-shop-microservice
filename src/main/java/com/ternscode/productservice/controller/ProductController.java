package com.ternscode.productservice.controller;

import com.ternscode.productservice.model.Products;
import com.ternscode.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/product")
@RequiredArgsConstructor
public class ProductController {
private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Products products){
        productService.addProduct(products);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Products> show() {
       return productService.showProducts();
    }



}
