package com.example.Blog.service;
import  com.example.Blog.entities.Category;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface IServiceCategory {

	public void saveCategory(Category c, MultipartFile mf) throws IOException;
    public List<Category> getAllCategories();
    public void deleteCategory(int id);
    public Category getCategory(int id);
    
	
}
