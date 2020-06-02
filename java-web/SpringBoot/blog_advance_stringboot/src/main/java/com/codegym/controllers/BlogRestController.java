package com.codegym.controllers;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class BlogRestController {

    @Autowired
    BlogService blogService;

    @GetMapping("/getAllListBlog")
//    @RequestMapping(value = "/getAllListStudents", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getAllListStudents() {
        List<Blog> studentList = blogService.findAll();

        return new ResponseEntity<List<Blog>>(studentList, HttpStatus.OK);
    }

    @GetMapping("/blogs")
    public ResponseEntity<Blog> getUsername(@SessionAttribute("blog") Blog blog) {
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getStudent(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Void> createStudent(@RequestBody Blog blog, UriComponentsBuilder ucBuilder) {
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/blog/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
