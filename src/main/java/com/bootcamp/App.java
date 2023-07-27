package com.bootcamp;

import com.bootcamp.rps.Game;
import com.bootcamp.rps.ResultEnum;
import com.bootcamp.rps.UserInput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ResultEnum result = Game.playRound(UserInput.getChoice());
        System.out.println("Result: " + result);
    }
}
