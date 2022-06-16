package com.example.Phonepeexp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phonepeexp.entity.User;
import com.example.Phonepeexp.services.UserService;

@RestController
@CrossOrigin
public class Usercontroller {
	@Autowired
	private UserService userservice;
	
@PostMapping("/register")
public User register(@RequestBody User u) {
	return this.userservice.register(u);
}

@PostMapping("/login")
public ResponseEntity<HttpStatus> login(@RequestBody User u){
	
return this.userservice.login(u);
}

}
