package com.example.Trainer.controller;


import com.example.Trainer.model.User;
import com.example.Trainer.service.TrainerService;
import com.example.Trainer.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("index")
public class indexController {

    private TrainerService trainerService;

    @Autowired
    public indexController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }



    @GetMapping
    public List<User> searchAll(){
        return trainerService.listTrainer();
    }
}
