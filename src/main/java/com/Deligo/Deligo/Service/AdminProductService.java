package com.Deligo.Deligo.Service;

import com.Deligo.Deligo.Entity.Products;

import java.util.List;

public interface AdminProductService {
    void addProduct(Products p);

    void delete(long id);

    void update(long id, double cost);
    List<Products> getAllProducts();
}
