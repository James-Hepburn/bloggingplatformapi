package com.example.bloggingplatformapi.controller;

import com.example.bloggingplatformapi.model.Post;
import com.example.bloggingplatformapi.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private PostRepository repo;

    public PostController (PostRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List <Post> getAllPosts () {
        return this.repo.findAll ();
    }
}
