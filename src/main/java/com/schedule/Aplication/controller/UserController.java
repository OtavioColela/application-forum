package com.schedule.Aplication.controller;

import com.schedule.Aplication.model.UserModel;
import com.schedule.Aplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserModel createUser(@RequestBody UserModel user){
    return userService.createUser(user);
    }

    @GetMapping
    public List<UserModel> getUsers(){
      return userService.getUsers();
    }

}
