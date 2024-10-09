package com.project.quan_li_ban_cafe.controllers;

import com.project.quan_li_ban_cafe.models.Category;
import com.project.quan_li_ban_cafe.services.categoryService.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @PostMapping("/addcategory")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/updatecategory/{id}")
    public Category updateCategory(@PathVariable long id,@RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/deletecategory/{id}")
    public boolean deleteCategory(@PathVariable long id) {
        return categoryService.deleteCategory(id);
    }

    @GetMapping("/listcategory")
    public List<Category> listCategory() {
        return categoryService.getAllCategories();
    }
}
