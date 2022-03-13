package com.khazbak;

import com.khazbak.game.Dice;
import com.khazbak.game.GameController;
import com.khazbak.player.Player;
import com.khazbak.player.PlayerList;

public class Main {

    public static void main(String[] args) {
        PlayerList list= new PlayerList();
        list.addPlayer("Khazbak");
        list.addPlayer("Seif");
        list.addPlayer("Yahya");
        GameController controller = new GameController();
        controller.startGame(list);

    }
}
