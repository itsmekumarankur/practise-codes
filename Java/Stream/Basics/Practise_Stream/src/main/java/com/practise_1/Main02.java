package com.practise_1;

import com.practise_1.domain.Player;
import com.practise_1.service.PlayerService;
import com.practise_1.service.impl.PlayerServiceImpl;

import java.util.Optional;

public class Main02 {

    public static void main(String args[]) {
        PlayerService service = new PlayerServiceImpl();
        Optional<Player> player = service.findPlayerByName("Luis Garcia");
        if (player.isPresent()) {
            System.out.println(player.get().getName());
        } else {
            System.out.println("Player not found!");
        }
    }
}
