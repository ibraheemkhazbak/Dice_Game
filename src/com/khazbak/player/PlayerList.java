package com.khazbak.player;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private List<Player> players;
    private int currentPlayerIndex;
    public PlayerList() {
        this.players = new ArrayList<>();
        resetIndex();
    }
    public void addPlayer(String name){
        players.add(new Player(name));

    }
    public void nextPlayer(){
        if(thereArePlayers()&&hasNextPlayer()){
            currentPlayerIndex++;
        }
    }

    public boolean hasNextPlayer() {
    return currentPlayerIndex+1<players.size();
    }

    private boolean thereArePlayers() {
        return players.size()>0;
    }

    public Player getCurrentPlayer(){
        return players.get(currentPlayerIndex);
    }


    public void resetIndex() {
        currentPlayerIndex=-1;
    }
    public Player getMaxScoredPlayer(){
        Player maxScoredPlayer=players.get(0);
        for (Player currentPlayer: players) {
            if(currentPlayer.getScore()>maxScoredPlayer.getScore()){
                maxScoredPlayer=currentPlayer;
            }
        }
        return maxScoredPlayer;
    }
}
