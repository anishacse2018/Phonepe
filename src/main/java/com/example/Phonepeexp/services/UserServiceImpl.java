package com.example.Phonepeexp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Phonepeexp.entity.User;
import com.example.Phonepeexp.repo.Userdb;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private Userdb users;

	@Override
	public User register(User u) {
		// TODO Auto-generated method stub
		users.save(u);
		return u;
	}

	@Override
	public ResponseEntity<HttpStatus> login(User u) {
		// TODO Auto-generated method stub
		List<User> li= users.findAll();
		for(User user:li) {
			if(u.getUser_name().equals(user.getUser_name())==true && u.getPassword().equals(user.getPassword())==true) {
				return new ResponseEntity<>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
