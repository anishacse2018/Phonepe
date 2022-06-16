package com.example.Phonepeexp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User{
	@Id
    private String user_name;
    private String password;
    private String name;
    public User(){
    	
    }
    public User(String user_name,String password,String name) {
    	super();
    	this.user_name=user_name;
    	this.password=password;
    	this.name=name;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
