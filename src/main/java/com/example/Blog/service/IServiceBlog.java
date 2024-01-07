package com.example.Blog.service;
import  com.example.Blog.entities.Blog;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface IServiceBlog {

	public void saveBlog(Blog b, MultipartFile mf) throws IOException;
    public List<Blog> getAllBlogs();
    public void deleteBlog(int id);
    public Blog getBlog(int id);
    
	
}