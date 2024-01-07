package com.example.Blog.service;
import  com.example.Blog.entities.Post;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface IServicePost {

	public void savePost(Post p, MultipartFile mf) throws IOException;
    public List<Post> getAllPosts();
    public void deletePost(int id);
    public Post getPost(int id);
    
	
}