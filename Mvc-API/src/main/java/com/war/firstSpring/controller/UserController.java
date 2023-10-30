package com.war.firstSpring.controller;

import com.war.firstSpring.resources.impl.UserDao;
import com.war.firstSpring.model.User;
import com.war.firstSpring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService = new UserService(
            new UserDao());


    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user) throws Exception {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> searchAll() throws Exception {

        return ResponseEntity.ok(userService.takeAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> searchById(@PathVariable Integer id) throws Exception {
        return ResponseEntity.ok(userService.searchbyId(id).orElse(null));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) throws Exception {
        ResponseEntity<User> response= null;
        if (user.getId() != null && userService.searchbyId(user.getId()).isPresent()){
            response = ResponseEntity.ok(userService.updateUser(user));
        } else {
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) throws Exception {
        ResponseEntity<String> response = null;

        if (userService.searchbyId(id).isPresent()){
            userService.deletebyId(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("User deletado");
        }else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }
}
