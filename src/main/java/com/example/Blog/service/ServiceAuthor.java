package com.example.Blog.service;

import com.example.Blog.dao.AuthorRepository;
import com.example.Blog.entities.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class ServiceAuthor implements IServiceAuthor{
    private AuthorRepository authorRepository;
    @Override
    public void saveAuthor(Author a,MultipartFile mf) throws IOException {
        
        authorRepository.save(a);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

  
    

    @Override
    public void deleteAuthor(int id) {
       authorRepository.deleteById(id);
    }

    @Override
    public Author getAuthor(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    
}

