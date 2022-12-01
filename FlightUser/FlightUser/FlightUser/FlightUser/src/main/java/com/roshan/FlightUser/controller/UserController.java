package com.roshan.FlightUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.roshan.FlightUser.Repositry.UserRepositry;
import com.roshan.FlightUser.model.User;
import com.roshan.FlightUser.service.SignUpService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin(origins="http://localhost:3000")
@RestController

public class UserController {
	
	@Autowired
	private SignUpService signUpService;
	

	
	@PostMapping("/saveUser")
	@ApiOperation(value = "To Add User Details")
	public String saveUser(@RequestBody User user) {
		try {
			this.signUpService.addUser(user);
			return "User Added Successfully " + user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Operation Failed";
	}
	

	
	@GetMapping("/getAllUser")
	@ApiOperation(value = "To Get All The User Details")
	public List<User> findAllUsers() {
		return signUpService.getuser();
	}
	
}
