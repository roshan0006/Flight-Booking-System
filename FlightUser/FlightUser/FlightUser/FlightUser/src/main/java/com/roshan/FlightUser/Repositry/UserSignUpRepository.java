package com.roshan.FlightUser.Repositry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.roshan.FlightUser.model.User;

/**
 *This Interface Is Used For Adding MongoRepository Which Acts As A Database
 */
@Repository
public interface UserSignUpRepository extends MongoRepository<User, Integer> {

}