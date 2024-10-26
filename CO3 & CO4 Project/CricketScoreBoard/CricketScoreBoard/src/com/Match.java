package com;

public class Match {
    private Team team1;
    private Team team2;
    private String status; // e.g., "In Progress", "Completed"
    private String tossWinner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.status = "Scheduled";
    }

    public void toss(String winner) {
        tossWinner = winner;
        status = "In Progress";
    }

    public String getStatus() {
        return status;
    }

    public Team getWinningTeam() {
        return tossWinner.equals(team1.getCaptain()) ? team1 : team2;
    }
}
