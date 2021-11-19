package com.practise_1.service;

import com.practise_1.domain.Player;

import java.util.Optional;

public interface PlayerService {
    /**
     * Find a Player by name
     * @param name
     * @return
     */
    public Optional<Player> findPlayerByName(String name);
}
