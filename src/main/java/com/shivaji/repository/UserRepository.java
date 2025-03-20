package com.shivaji.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.shivaji.model.User;

import jakarta.annotation.PostConstruct;

@Configuration
@Service
public class UserRepository {
	public static Integer USER_ID = 0;
	
	public static Map<Integer, User> userMap = new HashMap<>();
	
	@PostConstruct
	public void creteUser() {
		User user = new User(0, "David", "password","Sahil", 12, true, "daivd1024@gmail.com",new Date());
		this.save(user);
	}
	
	public User save(User user) {
		USER_ID++;
		user.setId(USER_ID);
		userMap.put(USER_ID, user);
		return user;
	}
	
	public List<User> findAll(){
		return new ArrayList<User>(userMap.values());
	}
	
	public User findById(int id) {
		return userMap.get(id);
	}
}
