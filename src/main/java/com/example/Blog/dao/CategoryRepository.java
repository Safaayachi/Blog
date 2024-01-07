package com.example.Blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
