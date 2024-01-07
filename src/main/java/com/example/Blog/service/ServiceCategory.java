package com.example.Blog.service;

import com.example.Blog.dao.CategoryRepository;
import com.example.Blog.entities.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class ServiceCategory implements IServiceCategory{
    private CategoryRepository categoryRepository;
    @Override
    public void saveCategory(Category c,MultipartFile mf) throws IOException {
        
    	categoryRepository.save(c);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

  
    

    @Override
    public void deleteCategory(int id) {
    	categoryRepository.deleteById(id);
    }

    @Override
    public Category getCategory(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    
}


