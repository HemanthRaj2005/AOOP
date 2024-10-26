package com;

public class Player {
    private String name;
    private int runsScored;
    private int wicketsTaken;

    public Player(String name) {
        this.name = name;
        this.runsScored = 0;
        this.wicketsTaken = 0;
    }

    public String getName() {
        return name;
    }

    public void addRuns(int runs) {
        runsScored += runs;
    }

    public void addWicket() {
        wicketsTaken++;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", runsScored=" + runsScored +
                ", wicketsTaken=" + wicketsTaken +
                '}';
    }
}
