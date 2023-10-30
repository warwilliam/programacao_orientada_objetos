package com.example.players_time.repository;

import com.example.players_time.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository <Player, Long> {



    public default void update(Player player) {
        PlayerRepository playerRepository = null;
        if (playerRepository.findById(player.getId()).isPresent()){
            playerRepository.save(player);
        }
    }


}
