package com.example.mongo.repository;

import com.example.mongo.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,Integer> {
}
