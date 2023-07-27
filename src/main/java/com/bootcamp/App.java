package com.bootcamp;

import com.bootcamp.rps.Game;
import com.bootcamp.rps.RPSEnum;
import com.bootcamp.rps.ResultEnum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ResultEnum result = Game.playRound(RPSEnum.ROCK);
        System.out.println("Result: " + result);
    }
}
