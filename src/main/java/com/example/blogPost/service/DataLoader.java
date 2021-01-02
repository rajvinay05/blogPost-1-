package com.example.blogPost.service;

import com.example.blogPost.domain.Author;
import com.example.blogPost.domain.Post;
import com.example.blogPost.repository.AuthorRepository;
import com.example.blogPost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DataLoader(PostRepository postRepository,AuthorRepository authorRepository){
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    private void loadData(){
        // create an author
//        Author dv = new Author("Dan","Vega");
//        authorRepository.save(dv);

//        // create a post
//        Post post = new Post("Spring Data Rocks!");
//        post.setBody("Post Body here...");
//        post.setAuthor(dv);
//        postRepository.save(post);
    }

}
