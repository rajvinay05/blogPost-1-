package com.example.blogPost;

import com.example.blogPost.domain.Post;
import com.example.blogPost.repository.PostRepository;
import com.example.blogPost.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class BlogPostApplication {

	private  static final Logger logger = LoggerFactory.getLogger(BlogPostApplication.class);

	//Post Repository
	@Autowired
	PostRepository postRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(BlogPostApplication.class, args);
	}

	@PostConstruct
	void seePost(){
		logger.info("seePosts method has been called...");
		for(Post post:postRepository.findAll()){
			logger.info(post.toString());
		}
	}
}
