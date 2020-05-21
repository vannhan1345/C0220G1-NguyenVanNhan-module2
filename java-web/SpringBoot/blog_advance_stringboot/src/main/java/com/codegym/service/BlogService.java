package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable);

    Blog findById(Integer id);

    void save(Blog model);

    void remove(Integer id);
}
