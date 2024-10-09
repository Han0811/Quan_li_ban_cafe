package com.project.quan_li_ban_cafe.services.productService;

import com.project.quan_li_ban_cafe.models.Product;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductService {
    public Product createProduct(Product product);
    public Product updateProduct(long id,Product product);
    public boolean deleteProduct(long id);
    public List<Product> getAllProduct();
    public Product getOneProduct(long id);
}
