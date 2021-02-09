package com.fullstackapp.backend.controller;

import com.fullstackapp.backend.model.User;
import com.fullstackapp.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
    @RequestMapping("users/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        return this.userRepository.findById(id);
    }
}
