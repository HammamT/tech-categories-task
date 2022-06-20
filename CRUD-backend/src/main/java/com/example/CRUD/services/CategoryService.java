package com.example.CRUD.services;

import com.example.CRUD.models.Category;

import java.util.List;

public interface CategoryService {

    public abstract List<Category> getAllCategories();
    public abstract void addCategory(Category category);
    public abstract void deleteCategory(Long id);
    public abstract void updateCategory(Long id, Category category);
}
