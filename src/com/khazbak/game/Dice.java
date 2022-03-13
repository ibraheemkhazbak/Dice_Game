package com.khazbak.game;

import java.util.Random;

public class Dice {
    public static int roll(){
        int number = (int)Math.round(1+(Math.random()*5));

        return number;
    }
}
