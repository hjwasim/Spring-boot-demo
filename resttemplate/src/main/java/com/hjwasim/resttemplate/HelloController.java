package com.hjwasim.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hjwasim
 */
@RestController
public class HelloController {
    private final RestConsumer restConsumer;

    @Autowired
    public HelloController(RestConsumer restConsumer) {
        this.restConsumer = restConsumer;
    }


    @GetMapping("/{id}")
    public List<Post> getPosts(@PathVariable String id){
        return restConsumer.getPosts(Integer.valueOf(id));
    }

    @GetMapping("/create")
    public ResponseDto createPost(){
        Post post = new Post();
        post.setId(6);
        post.setCompleted(true);
        post.setTitle("Java Persistance Book v4");
        return restConsumer.createPost(post);
    }
}
