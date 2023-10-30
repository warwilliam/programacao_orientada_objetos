package com.example.players_time.controller;

import com.example.players_time.model.Team;
import com.example.players_time.service.impl.TeamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamServiceImpl teamService;

    @PostMapping
    public ResponseEntity<Team> saveTeam(@RequestBody Team team){
        teamService.save(team);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Team>> searchAll(){
       return ResponseEntity.ok(teamService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchbyId(@PathVariable Long id){
        return ResponseEntity.ok(teamService.searchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletebyId(@PathVariable Long id){
        ResponseEntity<String> response = null;
        if (teamService.searchById(id).isPresent()){
        teamService.delete(id);
        response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Team excluido com sucesso");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Team> updateTeam(@RequestBody Team team){
        ResponseEntity<Team> response = null;

        if (team.getId() != null && teamService.searchById(team.getId()).isPresent()){
            response = ResponseEntity.ok(teamService.update(team));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }
}
