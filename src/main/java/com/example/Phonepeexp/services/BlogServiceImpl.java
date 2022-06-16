package com.example.Phonepeexp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phonepeexp.entity.Blog;
import com.example.Phonepeexp.repo.Blogdb;

@Service
public class BlogServiceImpl implements BlogService{
	@Autowired
	private Blogdb blogs;
	
	@Override
	public Blog create(Blog b) {
		blogs.save(b);
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	public List<Blog> getBlogs() {
		List<Blog> bl=blogs.findAll();
		return bl;
	}

	@Override
	public List<Blog> getBasedUser_name(String user_name) {
		// TODO Auto-generated method stub
		List<Blog>li=blogs.findAll();
		List<Blog>ans = new ArrayList();
		for(Blog b:li) {
			if(b.getUser_name().equals(user_name)==true) {
				ans.add(b);
			}
		}
		return ans;
	}

}
