package com.schedule.Aplication.service;

import com.schedule.Aplication.model.UserModel;
import com.schedule.Aplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel usermodel){
        if(usermodel.getName().isEmpty()){
            throw new RuntimeException("O nome não pode estar vazio");
        }
        return userRepository.save(usermodel);

    }
    public List<UserModel> getUsers(){
        return userRepository.findAll();
    }

}
