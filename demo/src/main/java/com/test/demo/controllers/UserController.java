package com.test.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.User;
import com.test.demo.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        repository.save(user);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody User user) {
        repository.update(user);
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return repository.finById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return repository.listAll();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.remove(id);
    }
}
