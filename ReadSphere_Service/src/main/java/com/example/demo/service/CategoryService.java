package com.example.demo.service;

import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    public Boolean saveCategory(Category category);
    public List<Category>getAllCategory();

}
