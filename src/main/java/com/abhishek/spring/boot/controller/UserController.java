package com.abhishek.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.spring.boot.dao.UserDao;
import com.abhishek.spring.boot.exceptions.ResourceNotFoundException;
import com.abhishek.spring.boot.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao userDao;

	@GetMapping("/getAllUsers")
	public List<User> getUsers() {
		List<User> list = userDao.getAllUsers();
		System.out.println("All Users Fetched Successfully");
		return list;
	}

	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable("userId") int id) {
		System.out.println("User Fetched Successfully");
		 User user = userDao.getUser(id);
		 if(user!=null) {
			 return user;
		 }else {
			  throw new ResourceNotFoundException("Resource Does Not Exists");
		 }		 
	}

	@PostMapping("/saveUser")
	public User addUser(@RequestBody User user) {
		System.out.println("Creating User: " + user.getId());
		return userDao.addUser(user);
	}

	@PutMapping("/UpdateUser")
	public User updateUser(@RequestBody User user) {
		System.out.println("(Updating User: " + user.getId());
		return userDao.updateUser(user);
	}

	@DeleteMapping("/DeleteUser/{userId}")
	public void deleteUser(@PathVariable("userId") int id) {
		System.out.println("Deleting User: " + id);
		System.out.println("User Deleted Successfully");
		userDao.deleteUser(id);
	}

}
