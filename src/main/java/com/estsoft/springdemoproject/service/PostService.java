package com.estsoft.springdemoproject.service;

import com.estsoft.springdemoproject.entity.Post;
import com.estsoft.springdemoproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(Boolean isDeleted) {
        return postRepository.findAllByIsDeletedOrderByCreatedAtDesc();
    }
}
