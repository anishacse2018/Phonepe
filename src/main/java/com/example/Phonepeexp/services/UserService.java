package com.example.Phonepeexp.services;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.Phonepeexp.entity.User;


public interface UserService {
	
     public User register(User u);
     public ResponseEntity<HttpStatus>login(User u);
}
