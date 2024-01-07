package com.example.Blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
