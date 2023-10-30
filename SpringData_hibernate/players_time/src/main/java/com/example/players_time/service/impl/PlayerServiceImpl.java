package com.example.players_time.service.impl;

import com.example.players_time.model.Player;
import com.example.players_time.repository.PlayerRepository;
import com.example.players_time.repository.TeamRepository;
import com.example.players_time.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements InterfaceService<Player> {

    PlayerRepository playerRepository;
    TeamRepository teamRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Player> searchAll() {
        return playerRepository.findAll();
    }

    @Override
    public Optional<Player> searchById(Long id) {
        return playerRepository.findById(id).isPresent() ? playerRepository.findById(id) : Optional.empty();
    }

    @Override
    public void delete(Long id) {
            playerRepository.deleteById(id);
    }

    @Override
    public Object save(Player player) {
        return playerRepository.save(player);
    }


    @Override
    public Player update(Player player) {
        playerRepository.update(player);
        return player;
    }
}
