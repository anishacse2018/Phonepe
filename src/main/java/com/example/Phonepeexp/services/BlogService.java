package com.example.Phonepeexp.services;

import java.util.List;

import com.example.Phonepeexp.entity.Blog;

public interface BlogService {
    public Blog create(Blog b);
    public List<Blog> getBlogs(); 
    public List<Blog> getBasedUser_name(String user_name);
}
