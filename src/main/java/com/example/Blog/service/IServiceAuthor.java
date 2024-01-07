package com.example.Blog.service;
import  com.example.Blog.entities.Author;


import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
public interface IServiceAuthor {

	public void saveAuthor(Author a, MultipartFile mf) throws IOException;
    public List<Author> getAllAuthors();
    public void deleteAuthor(int id);
    public Author getAuthor(int id);
    
	
}
