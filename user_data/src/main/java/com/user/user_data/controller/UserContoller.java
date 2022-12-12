package com.user.user_data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.user_data.model.User;
import com.user.user_data.service.UserService;


@RestController
@RequestMapping("/user")
public class UserContoller {
    
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User save(@RequestBody User user){

        return userService.save(user);
    }

    @GetMapping("/get")
    public List<User> getAll(){
        return userService.getAll();
    }

    @PutMapping("/put")
    public User edit(@RequestBody User user){
        return userService.edit(user);
    }

    @PutMapping("/update")
    public User updatUser(@RequestBody User user){
        return userService.updateUser(user);
    }



}
