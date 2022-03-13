package com.khazbak.player;


public class Player {
    private String name;
    private int score;
    public static final int rounds=3;
    public Player(String name) {
        this.name = name;
        this.score=0;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addScore(int score){
        this.score+=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
