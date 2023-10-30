package com.example.players_time.service.impl;


import com.example.players_time.model.Player;
import com.example.players_time.model.Team;
import com.example.players_time.repository.TeamRepository;
import com.example.players_time.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements InterfaceService<Team> {

    @Autowired
    TeamRepository teamRepository;

    @Override
    public List<Team> searchAll() {
        return teamRepository.findAll();
    }

    @Override
    public Optional<Team> searchById(Long id) {
        return teamRepository.findById(id).isPresent() ? teamRepository.findById(id) : Optional.empty();
    }

    @Override
    public void delete(Long id) {
            teamRepository.deleteById(id);
    }

    @Override
    public Object save(Team team) {
        return teamRepository.save(team);
    }
    @Override
    public Team update(Team team) {

        return teamRepository.save(team);
    }
}
