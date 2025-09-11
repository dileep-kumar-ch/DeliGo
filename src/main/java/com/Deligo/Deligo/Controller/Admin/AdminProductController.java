package com.Deligo.Deligo.Controller.Admin;

import com.Deligo.Deligo.Entity.Products;
import com.Deligo.Deligo.Service.AdminProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Admin")
public class AdminProductController {
    @Autowired
    private AdminProductService APServ;

    @PostMapping("/AddProduct")
    String addProduct(@RequestBody Products p) {
        APServ.addProduct(p);
    return "Product Added";
    }
    @DeleteMapping ("/deleteProduct/{id}")
    String deleteProduct(@PathVariable("id") int id) {
        APServ.delete(id);
        return "Product Deleted Succesfully";

    }

    @PutMapping  ("/updateProduct/{id}/{price}")
    String updateProduct(@PathVariable("id") int id,@PathVariable("price") double price) {
        APServ.update(id, price);
        return "Product Updated Succesfully";
    }
    }