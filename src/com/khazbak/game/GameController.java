package com.khazbak.game;

import com.khazbak.player.Player;
import com.khazbak.player.PlayerList;

import java.util.Scanner;

public class GameController {
    public void startGame(PlayerList list){
        list.resetIndex();
        Player currentPlayer;
        while(list.hasNextPlayer()){

            list.nextPlayer();
            currentPlayer = list.getCurrentPlayer();
            printTurnMessage(currentPlayer);
            play(currentPlayer);
        }
        Player winningPlayer=list.getMaxScoredPlayer();
        System.out.println("congratulations "+winningPlayer.getName() +" you won with "+ winningPlayer.getScore());
    }

    private void printTurnMessage(Player currentPlayer) {
        System.out.println(currentPlayer.getName() + "'s turn");

    }

    private void play(Player player) {
        Scanner scanner = new Scanner(System.in);
        int roll=0;
        for (int i = 0; i < Player.rounds; i++) {
            System.out.println("roll dice");
            scanner.nextLine();

            roll=Dice.roll();
            System.out.println("you have rolled "+roll);
            if(validRoll(roll)){
                player.addScore(roll);
            }else{
                System.out.println(player.getName() + " has lost the game");
                return;
            }
        }
        System.out.println(player.getName() +" has scored "+player.getScore());
    }
    private boolean validRoll(int roll) {
        return roll>1;
    }

}
