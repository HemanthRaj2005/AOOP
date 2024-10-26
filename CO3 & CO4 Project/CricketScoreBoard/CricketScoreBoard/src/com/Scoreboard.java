package com;

public class Scoreboard {
    private Match match;
    private int totalRuns;
    private int totalWickets;

    public Scoreboard(Match match) {
        this.match = match;
        this.totalRuns = 0;
        this.totalWickets = 0;
    }

    public void updateScore(int runs, boolean isWicket) {
        totalRuns += runs;
        if (isWicket) {
            totalWickets++;
        }
    }

    public void displayScore() {
        System.out.println("Score: " + totalRuns + "/" + totalWickets);
    }
}