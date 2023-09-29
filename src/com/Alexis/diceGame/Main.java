package com.Alexis.diceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Dice game
        *Restart of whole project, first one went to deep and felt easier to start over.
        *
        *MUSTS = 2 players with names, amount of dices chosen, a winner
        * TODO (may or may not be in order)
        *  Initialize Git rep - DONE
        *  Introduction to game - DONE
        *  Ask for names - DONE
        *  Ask for amount of dices -
        *  Throw dices -
        *  Show result -
        *  Announce winner! - */

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome do Dice Game v.3!");
        System.out.println("Please choose a name for Player #1: ");
        String newPlayer = userInput.nextLine();
        Players playerOne = new Players(newPlayer, 1);
        System.out.println("Welcome: " + playerOne.getPlayer() + "!");
        System.out.println("Please choose a name for Player #2: ");
        newPlayer = userInput.nextLine();
        Players playerTwo = new Players(newPlayer, 2);
        System.out.println("Welcome: " + playerTwo.getPlayer() + "!");



    }

}