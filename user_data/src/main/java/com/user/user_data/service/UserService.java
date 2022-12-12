package com.user.user_data.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_data.model.User;
import com.user.user_data.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        // user.setJoiningData(new Date())
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.find();
    }

    public User edit(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.update(user);
    }
    
}
