package com.example.mywebapp.service;

import com.example.mywebapp.model.User;
import com.example.mywebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class UserService {

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        LOGGER.info("Retrieved " + users.size() + " users from the database");
        return users;
    }

    // Other methods as needed
}
