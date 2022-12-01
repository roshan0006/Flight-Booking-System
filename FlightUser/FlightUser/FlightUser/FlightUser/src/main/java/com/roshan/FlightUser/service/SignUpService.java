package com.roshan.FlightUser.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.FlightUser.Repositry.UserSignUpRepository;
import com.roshan.FlightUser.model.User;


/**
 * This Class Is Used As A Service Where You Can
 *  Explicitly Execute Methods For Controllers
 */
@Service
public class SignUpService {
	
	@Autowired
	private UserSignUpRepository userSignUpRepository;

	
	/*** Method For Adding Data ***/
	public void addUser(User user) {
		userSignUpRepository.save(user);
	}


	/*** Method For Listing The Data ***/
	public List<User> getuser() {
		List<User> s = userSignUpRepository.findAll();
		return s;
	}
}
