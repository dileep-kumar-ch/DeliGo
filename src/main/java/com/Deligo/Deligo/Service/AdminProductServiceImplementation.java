package com.Deligo.Deligo.Service;

import com.Deligo.Deligo.Entity.Products;
import com.Deligo.Deligo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminProductServiceImplementation implements AdminProductService{
    @Autowired
    private ProductRepo PRepo;

    @Override
    public void addProduct(Products p) {
        PRepo.save(p);
    }
    @Override
    public void delete(long id) {
        PRepo.deleteById(id);
    }

    @Override
    public void update(long id ,double cost) {
        Optional<Products> productOpt = PRepo.findById(id);
        if (productOpt.isPresent()) {
            Products product = productOpt.get();
            product.setPrice(cost); // update price
            PRepo.save(product); // save updated entity
        }
    }

    @Override
    public List<Products> getAllProducts() {
        return PRepo.getAllProducts();
    }
}
