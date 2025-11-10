package main.java.com.test.hosting.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import main.java.com.test.hosting.demo.entity.User;
import main.java.com.test.hosting.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
