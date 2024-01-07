package com.example.Blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer>{

}
