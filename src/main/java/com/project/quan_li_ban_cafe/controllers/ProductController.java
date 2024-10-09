package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Product;
import com.project.quan_li_ban_cafe.services.productService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/updateproduct")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/deleteproduct")
    public boolean deleteProduct(@PathVariable long id) {
        return productService.deleteProduct(id);
    }

    @GetMapping("/listproduct")
    public List<Product> listProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/one product")
    public Product getProductById(@PathVariable long id) {
        return productService.getOneProduct(id);
    }
}
