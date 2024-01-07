package com.example.Blog.service;

import com.example.Blog.dao.PostRepository;
import com.example.Blog.entities.Post;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class ServicePost implements IServicePost{
    private PostRepository postRepository;
    @Override
    public void savePost(Post p,MultipartFile mf) throws IOException {
        
        postRepository.save(p);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

  
    

    @Override
    public void deletePost(int id) {
       postRepository.deleteById(id);
    }

    @Override
    public Post getPost(int id) {
        return postRepository.findById(id).orElse(null);
    }

    
}



