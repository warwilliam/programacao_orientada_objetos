package com.example.players_time.controller;

import com.example.players_time.model.Player;
import com.example.players_time.repository.PlayerRepository;
import com.example.players_time.service.InterfaceService;
import com.example.players_time.service.impl.PlayerServiceImpl;
import com.example.players_time.service.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private PlayerServiceImpl playerService;
    private TeamServiceImpl teamService;

    @Autowired
    public PlayerController(PlayerServiceImpl playerService, TeamServiceImpl teamService) {
        this.playerService = playerService;
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<?> savePlayer(@RequestBody Player player){
        teamService.save(player.getTeam());
        playerService.save(player);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<?>> searchAllPlayer(){
        return ResponseEntity.ok(playerService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchById(@PathVariable Long id){
        return ResponseEntity.ok(playerService.searchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable Long id){
        playerService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Player player){
        playerService.update(player);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
