package com.codegym.controllers;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> provinces() {
        return categoryService.findAll();
    }

    @GetMapping("/")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New Blog created successfully");
        return modelAndView;
    }

//    @GetMapping("/blog")
//    public ModelAndView listBlog(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 3) Pageable pageable) {
//        Page<Blog> blogs;
//        String keywordLast = null;
//        if (keyword.isPresent()) {
//            keywordLast = keyword.get();
//            blogs = blogService.findAllByFirstNameContaining(keywordLast, pageable);
//        } else {
//            blogs = blogService.findAll(pageable);
//        }
//        ModelAndView modelAndView = new ModelAndView("/blog/list");
//        modelAndView.addObject("keyword", keywordLast);
//        modelAndView.addObject("listBlog", blogs);
//        if (blogs.getTotalPages() == 0) {
//            modelAndView.addObject("message", "Not found!");
//        }
//        return modelAndView;
//    }

        @GetMapping("/blog")
    public ModelAndView listBlogSearch(@RequestParam("keyword") Optional<String> keyword, Pageable pageable){
        Pageable pageableSortByBlogId = PageRequest.of(pageable.getPageNumber(),3, Sort.by("name").ascending());
        String keywordLast = null;
        Page<Blog> blogs;
        if(keyword.isPresent()){
            keywordLast=keyword.get();
            blogs = blogService.findAllByFirstNameContaining(keywordLast, pageableSortByBlogId);
        } else {
            blogs = blogService.findAll(pageableSortByBlogId);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("listBlog", blogs);
        modelAndView.addObject("keyword",keywordLast);
        if (blogs.getTotalPages() == 0) {
            modelAndView.addObject("message", "Not found!");
        }
        return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog) {

        Date date = new Date();
        blog.setDateBlog(date);
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:blog";
    }

    @GetMapping("/read-blog/{id}")
    public ModelAndView read(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("blog/read");
        modelAndView.addObject("blog", blogService.findById(id));
        return modelAndView;
    }
}
