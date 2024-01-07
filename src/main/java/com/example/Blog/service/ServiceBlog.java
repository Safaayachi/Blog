package com.example.Blog.service;

import com.example.Blog.dao.BlogRepository;
import com.example.Blog.entities.Blog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class ServiceBlog implements IServiceBlog{
    private BlogRepository blogRepository;
    @Override
    public void saveBlog(Blog b,MultipartFile mf) throws IOException {
        
        blogRepository.save(b);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

  
    

    @Override
    public void deleteBlog(int id) {
       blogRepository.deleteById(id);
    }

    @Override
    public Blog getBlog(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    
}


