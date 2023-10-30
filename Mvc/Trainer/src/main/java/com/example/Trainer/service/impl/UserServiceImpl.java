package com.example.Trainer.service.impl;

import com.example.Trainer.model.Trainer;
import com.example.Trainer.model.User;
import com.example.Trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserServiceImpl implements TrainerService {
    @Override
    public List listTrainer() {
       List<User> users = new ArrayList<>();
               User user = new User("William","Rodrigues");
               User user1 = new User("Antonio","Rodrigues");
               User user2 = new User("Natalia","Rodrigues");

                users.add(1,user1);
                users.add(2,user2);
                users.add(3,user);

                return users;
    }
}
