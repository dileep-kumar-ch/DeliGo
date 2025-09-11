package com.Deligo.Deligo.Controller.Customer;

import com.Deligo.Deligo.Entity.Products;
import com.Deligo.Deligo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerProductController {
    @Autowired
    ProductRepo productRepo;
       @GetMapping("/getProducts")

       List<Products> getAllProducts () {
          List<Products> productsList = productRepo.getAllProducts();
          return productsList;
       }
//
//    Search products (by name/category)
//
//    View single product details
}
