package com.flight.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("flight_details")
public class flight {
	@Id
	private String id;
	private String time;
	private String flight;
	private String duration;
	private String fare;
	public flight(String id, String time, String flight, String duration, String fare) {
		super();
		this.id = id;
		this.time = time;
		this.flight = flight;
		this.duration = duration;
		this.fare = fare;
	}
	public flight() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuretion(String duration) {
		this.duration = duration;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "flight [id=" + id + ", time=" + time + ", flight=" + flight + ", duration=" + duration + ", fare="
				+ fare + "]";
	}
	
}
