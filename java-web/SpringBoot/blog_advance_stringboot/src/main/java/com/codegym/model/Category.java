package com.codegym.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;

    @OneToMany
    private List<Blog> blogList;

    public Category() {
    }

    public Category(String name) {

        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> listBlog) {
        this.blogList = listBlog;
    }
}
