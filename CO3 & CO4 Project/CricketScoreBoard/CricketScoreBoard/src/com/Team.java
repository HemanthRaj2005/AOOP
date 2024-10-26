package com;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;
    private String captain;

    public Team(String teamName, String captain) {
        this.teamName = teamName;
        this.captain = captain;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getCaptain() {
        return captain;
    }
}
