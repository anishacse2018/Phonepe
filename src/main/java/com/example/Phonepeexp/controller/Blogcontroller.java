package com.example.Phonepeexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phonepeexp.entity.Blog;
import com.example.Phonepeexp.services.BlogService;


@RestController
@CrossOrigin
public class Blogcontroller {
	@Autowired
	private BlogService blogservice;
	
@PostMapping("/blog")
public Blog create(@RequestBody Blog b) {
	return this.blogservice.create(b);
}

@GetMapping("/get/blogs")
public List<Blog> getBlogs() {
	return this.blogservice.getBlogs();
}

@GetMapping("/{user_name}/blogs")
public List<Blog> getBasedUser_name(@PathVariable String user_name){
	return this.blogservice.getBasedUser_name(user_name);
}
}
