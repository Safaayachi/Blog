package com.example.Blog.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Blog.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer>{

}
