package com.example.Blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Blog;

public interface BlogRepository extends JpaRepository<Blog,Integer>{

}
