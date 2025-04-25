package com.schedule.Aplication.controller;

import com.schedule.Aplication.model.FriendModel;
import com.schedule.Aplication.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendController {
    @Autowired
    private FriendRepository friendRepository;
    @PostMapping
    public FriendModel createFriend(@RequestBody FriendModel friend){
        if(friend.getNome().isEmpty()){
            throw new RuntimeException("O nome não pode estar vazio");
        }
        return friendRepository.save(friend);

    }
    @GetMapping
    public List<FriendModel> getFriend(){
        return friendRepository.findAll();
    }

}
