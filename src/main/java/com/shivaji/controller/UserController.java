package com.shivaji.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivaji.model.User;
import com.shivaji.repository.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="findAll")
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
	@GetMapping(value="find/{id}")
	public User findById(@PathVariable("id") int id){
		return userRepository.findById(id);
	}
	
	@PostMapping(value="save")
	public User save(@RequestBody @Valid User user) {
		return userRepository.save(user);
	}
}
