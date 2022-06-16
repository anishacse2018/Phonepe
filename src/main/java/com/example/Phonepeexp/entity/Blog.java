package com.example.Phonepeexp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
	@Id
   private int blog_id;
	private String blog_name;
	private String blog_desc;
	private String blog_time;
	private String user_name;
	
	public int getBlog_id() {
		return blog_id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getBlog_desc() {
		return blog_desc;
	}
	public void setBlog_desc(String blog_desc) {
		this.blog_desc = blog_desc;
	}
	public String getBlog_time() {
		return blog_time;
	}
	public void setBlog_time(String blog_time) {
		this.blog_time = blog_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
   
}
