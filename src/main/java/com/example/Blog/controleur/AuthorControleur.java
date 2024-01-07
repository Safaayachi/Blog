package com.example.Blog.controleur;


import com.example.Blog.dao.AuthorRepository;
import com.example.Blog.entities.Author;
import com.example.Blog.service.IServiceAuthor;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@AllArgsConstructor
public class AuthorControleur {

    private IServiceAuthor serviceAuthor;
    private AuthorRepository authorRepository;
   

   

    @GetMapping("/admin/deleteAuthor/{id}")
    public String deleteAuthor(@PathVariable("id") int idAuthor)
    {
        serviceAuthor.deleteAuthor(idAuthor);
        return "redirect:/user/index";
    }

    @GetMapping("/admin/formAuthor")
    public String formAjout(Model m)
    {m.addAttribute("author",authorRepository.findAll());
        m.addAttribute("author",new Author());
        return "ajouterAuthor";
    }

    @PostMapping("/admin/saveAuthor")
    public String saveAuthor(@ModelAttribute Author a,@RequestParam("file") MultipartFile mf) throws IOException {
        serviceAuthor.saveAuthor(a,mf);
        return "redirect:/user/index";
    }
    @GetMapping("/admin/updateAuthor/{id}")
    public String updateAuthor(@PathVariable int id,Model m)
    {
        Author a=serviceAuthor.getAuthor(id);
        m.addAttribute("Author",a);
        return "ajouterAuthor";
    }

    @GetMapping("/author")
    public String home()
    {
        return "redirect:/user/index";
    }

}

