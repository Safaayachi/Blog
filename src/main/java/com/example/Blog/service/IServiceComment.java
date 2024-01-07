package com.example.Blog.service;
import  com.example.Blog.entities.Comment;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface IServiceComment {

	public void saveComment(Comment c, MultipartFile mf) throws IOException;
    public List<Comment> getAllComments();
    public void deleteComment(int id);
    public Comment getComment(int id);
    
	
}