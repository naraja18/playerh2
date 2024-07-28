package com.example.player.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;

@RestController
public class PlayerController {
    PlayerH2Service apiservice = new PlayerH2Service();

    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        return apiservice.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return apiservice.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")

    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return apiservice.getPlayerById(playerId);

    }

    @PutMapping("players/{playerId}")

    public Player updatPlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return apiservice.updatePlayer(playerId, player);
    }

    @DeleteMapping("players/{playerId}")

    public void deletePlayer(@PathVariable("playerId") int playerId) {
        apiservice.deletePlayer(playerId);
    }

}
