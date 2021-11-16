package com.practise_1.service.impl;

import com.practise_1.domain.Player;
import com.practise_1.enums.Position;
import com.practise_1.service.PlayerService;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Class to implement PlayerService interface
 */
public class PlayerServiceImpl implements PlayerService {

    static List<Player> players = new ArrayList<Player>();
    static {
        players.add(new Player(1, "Jorge Campos", Position.PORTERO, LocalDate.of(1966, Month.OCTOBER, 15)));
        players.add(new Player(4, "Claudio Suarez", Position.DEFENSA, LocalDate.of(1968, Month.DECEMBER, 17)));
        players.add(new Player(8, "Alberto Garcia", Position.MEDIO, LocalDate.of(1967, Month.MAY, 11)));
        players.add(new Player(7, "Ramon Ramirez", Position.MEDIO, LocalDate.of(1969, Month.DECEMBER, 5)));
        players.add(new Player(15, "Luis Hernandez", Position.DELANTERO, LocalDate.of(1968, Month.DECEMBER, 22)));
        players.add(new Player(20, "Jose Viera", Position.DELANTERO, LocalDate.of(1983, Month.MAY, 25)));
    }

    public Optional<Player> findPlayerByName(String name) {
        return players.stream().filter((player -> player.getName().equals(name))).findFirst();
    }
}
