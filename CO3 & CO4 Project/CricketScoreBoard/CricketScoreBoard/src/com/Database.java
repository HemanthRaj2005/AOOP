package com;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Player> playersDB;

    public Database() {
        playersDB = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        playersDB.add(player);
    }

    public List<Player> getPlayers() {
        return playersDB;
    }

    public void displayPlayers() {
        for (Player player : playersDB) {
            System.out.println(player);
        }
    }
}

