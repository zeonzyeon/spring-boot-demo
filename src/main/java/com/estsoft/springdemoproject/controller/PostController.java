package com.estsoft.springdemoproject.controller;

import com.estsoft.springdemoproject.entity.Post;
import com.estsoft.springdemoproject.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPostList(
            @RequestParam(name = "isDeleted", defaultValue = "false") Boolean isDeleted) {

        List<Post> posts = postService.getAllPosts(isDeleted);
        return ResponseEntity.ok(posts);
    }
}
