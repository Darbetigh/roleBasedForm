package com.example.security2.service;

import com.example.security2.model.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    void saveProduct(Product product);

    void deleteProduct(Integer id);
}
