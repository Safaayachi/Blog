package com.example.Blog.service;

import com.example.Blog.dao.CommentRepository;
import com.example.Blog.entities.Comment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class ServiceComment implements IServiceComment{
    private CommentRepository commentRepository;
    @Override
    public void saveComment(Comment c,MultipartFile mf) throws IOException {
        
    	commentRepository.save(c);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

  
    

    @Override
    public void deleteComment(int id) {
    	commentRepository.deleteById(id);
    }

    @Override
    public Comment getComment(int id) {
        return commentRepository.findById(id).orElse(null);
    }

    
}
