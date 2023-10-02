package com.Alexis.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Dice game
        *Restart of whole project, first one went to deep and felt easier to start over.
        * TODO (may or may not be in order)
        * MUSTS = 2 players with names, amount of dices chosen, a winner
        *
        *  Initialize Git rep - DONE
        *  Introduction to game - DONE
        * PLAYERS
            *  Ask for names - DONE
            * Save players - DONE
        * DICE:
            *  Ask for amount of dices - DONE
            *  Throw dices - DONE
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
        int dices = diceAmount();
        rollDice(playerOne, dices);
        System.out.println("Now for " + playerTwo.getPlayer() + " turn");
        rollDice(playerTwo,dices);
    }
    public static int diceAmount(){
        System.out.println("How many dices would you like to throw?");
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
    public static void rollDice(Players player, int rollAmount){
        Random random = new Random();
        for (int i = 0; i <rollAmount; i++) {
            int newDice = random.nextInt(1,7);
            System.out.println(player.getPlayer() + " rolled: " + newDice);
        }
    }
    
}