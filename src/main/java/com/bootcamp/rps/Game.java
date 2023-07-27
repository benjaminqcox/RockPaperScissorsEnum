package com.bootcamp.rps;

import java.util.Random;

public class Game {
    public static ResultEnum playRound(RPSEnum userChoice) {
        Random rand = new Random();
        RPSEnum computerChoice = RPSEnum.values()[rand.nextInt(RPSEnum.values().length)];
        ResultEnum res = userChoice.getResult(computerChoice);
        System.out.println(userChoice + " VS " + computerChoice);
        return res;
    }
}
