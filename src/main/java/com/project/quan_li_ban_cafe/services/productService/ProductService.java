package com.project.quan_li_ban_cafe.services.productService;

import com.project.quan_li_ban_cafe.models.Product;
import com.project.quan_li_ban_cafe.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        if(product != null) {
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(long id, Product product) {
        if(product != null) {
            Product result = productRepository.getById(id);
            if(result != null) {
                result.setTitle(product.getTitle());
                result.setName_product(product.getName_product());
                result.setPrice(product.getPrice());
                result.setDetail(product.getDetail());
                result.setId_category(product.getId_category());

                return productRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteProduct(long id) {
        if(id > 0){
            Product result = productRepository.getById(id);
            if(result != null){
                productRepository.delete(result);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getOneProduct(long id) {

        return productRepository.getById(id);
    }
}
