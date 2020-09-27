package com.example.mongo.controller;

import com.example.mongo.entities.Users;
import com.example.mongo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class TodoController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/notes/{id}")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

}
