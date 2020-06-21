package controller;

import java.util.Random;

public class Helper {

    static int throwDice(){
        Random rand = new Random();

        // nextInt as provided by Random is exclusive of the top value so you need to add 1

        int randomNum = rand.nextInt((6 - 1) + 1) + 1;
        return randomNum;
    }
}
