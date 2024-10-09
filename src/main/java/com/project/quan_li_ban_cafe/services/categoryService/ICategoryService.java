package com.project.quan_li_ban_cafe.services.categoryService;


import com.project.quan_li_ban_cafe.models.Category;

import java.util.List;

public interface ICategoryService {
    public Category createCategory(Category category);
    public Category updateCategory(long id,Category category);
    public boolean deleteCategory(long id);
    public List<Category> getAllCategories();
}
