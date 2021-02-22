package com.future.transactionManagement.controller;

import com.future.transactionManagement.models.Product;
import com.future.transactionManagement.service.IProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    IProductManager productManager;

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return productManager.saveProduct(product);
    }
}
