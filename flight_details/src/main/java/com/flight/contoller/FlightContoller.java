package com.flight.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.flight;
import com.flight.repository.FlightDuo;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class FlightContoller {
	@Autowired
	FlightDuo duo;
	@GetMapping("/flight")
	public List<flight> getflights() {
		return duo.findAll();
		
	}
	@PostMapping("/saveFlight")
	public void saveUser(@RequestBody flight flight) {
		duo.save(flight);
	}
}
