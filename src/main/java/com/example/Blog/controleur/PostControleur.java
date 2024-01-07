package com.example.Blog.controleur;

import com.example.Blog.dao.BlogRepository;
import com.example.Blog.dao.CategoryRepository;
import com.example.Blog.entities.Post;
import com.example.Blog.service.IServicePost;
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
public class PostControleur {

    private IServicePost servicePost;
    private CategoryRepository categoryRepository;
   

   

    @GetMapping("/admin/delete/{id}")
    public String deletePost(@PathVariable("id") int idPost)
    {
        servicePost.deletePost(idPost);
        return "redirect:/user/index";
    }

    @GetMapping("/admin/formpost")
    public String formAjout(Model m)
    {m.addAttribute("categories",categoryRepository.findAll());
        m.addAttribute("post",new Post());
        return "ajouterPost";
    }

    @PostMapping("/admin/save")
    public String savePost(@ModelAttribute Post p,@RequestParam("file") MultipartFile mf) throws IOException {
        servicePost.savePost(p,mf);
        return "redirect:/user/index";
    }
    @GetMapping("/admin/update/{id}")
    public String updatePost(@PathVariable int id,Model m)
    {
        Post p=servicePost.getPost(id);
        m.addAttribute("post",p);
        m.addAttribute("categories",categoryRepository.findAll());
        return "ajouterPost";
    }

    @GetMapping("/post")
    public String home()
    {
        return "redirect:/user/index";
    }

}

