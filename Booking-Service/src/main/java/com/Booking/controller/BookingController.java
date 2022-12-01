package com.Booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Booking.flight.BookingFlight;
import com.Booking.repo.BookingRepo;
//import com.Booking.service.BookingService;
@CrossOrigin(origins="http://localhost:3000")
@RestController

public class BookingController {
//	@Autowired
//	BookingService service;
	@Autowired
	BookingRepo repo;
	
	@PostMapping("/saveFilght/{id}")
	public String saveFlight(@RequestBody BookingFlight id) {
	 repo.save(id);
	 return "done";
	 
		
	}

	
	@GetMapping("/getFlight/FromAndTo")
	public ResponseEntity<List<BookingFlight>> GetFlight(@RequestParam String from, @RequestParam String to){
		return new ResponseEntity<List<BookingFlight>>(repo.findByFromAndTo(from, to), HttpStatus.OK);
	}
}
