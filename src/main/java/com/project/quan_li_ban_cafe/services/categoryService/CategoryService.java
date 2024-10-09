package com.project.quan_li_ban_cafe.services.categoryService;

import com.project.quan_li_ban_cafe.models.Category;
import com.project.quan_li_ban_cafe.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        if(category != null) {
            return categoryRepository.save(category);
        }
        return null;
    }

    @Override
    public Category updateCategory(long id, Category category) {
        if(category != null) {
            Category result = categoryRepository.getById(id);
            if(result != null) {
                result.setName(category.getName());

                return categoryRepository.save(result);
            }
        }
        return null;
    }

    @Override
    public boolean deleteCategory(long id) {
        if(id > 0){
            Category result = categoryRepository.getById(id);
            if(result != null) {
                categoryRepository.delete(result);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
