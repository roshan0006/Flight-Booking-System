package com.Booking.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Booking.flight.BookingFlight;

@Repository
public interface BookingRepo  extends MongoRepository<BookingFlight, String> {

	List<BookingFlight> findByFromAndTo(String from, String to);

}
