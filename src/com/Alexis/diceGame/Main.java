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
            * Ask for names - DONE
            * Save playersnames - DONE
        * DICE:
            *  Ask for amount of dices - DONE
            *  Throw dices - DONE
            *  Show result - DONE
        *  Announce winner! - DONE
        * Introduce try/catch for int - DONE & Strings - DONE
        * Create 3 tests, example for: Dice range 1-6* - DONE, toLower test - DONE.*/


        System.out.println("Welcome do Dice Game v.3!");
        do {


            System.out.println("Please choose a name for Player #1: ");
            String newPlayer = Scanning.scanLine();
            Players playerOne = new Players(newPlayer, 1);
            System.out.println("Welcome: " + playerOne.getPlayer() + "!");

            System.out.println("Please choose a name for Player #2: ");
            newPlayer = Scanning.scanLine();
            Players playerTwo = new Players(newPlayer, 2);
            System.out.println("Welcome: " + playerTwo.getPlayer() + "!");

            int dices = diceAmount();
            int playerSumOne = rollDice(playerOne, dices);
            System.out.println("Now for " + playerTwo.getPlayer() + " turn");
            int playerSumTwo = rollDice(playerTwo, dices);

            winnerWinnerChickenDinner(playerOne, playerTwo, playerSumOne, playerSumTwo);
            System.out.println("\nWould you like to play again?\n\t\t yes or no:");
            do {
                String quit = Scanning.scanLine().toLowerCase();
                if (quit.equals("no")) {
                    System.out.println("\t\tThanks for playing!");
                    System.exit(0);
                } else if (quit.equals("yes")) {
                    break;
                } else {
                    System.out.println("\t\tPlease write yes or no!");
                }
            }while (true);
        }while (true);
        }
    public static int diceAmount(){
        System.out.println("How many dices would you like to throw?");
        try{
            return Scanning.scanInt();
        }catch (Exception error){
            System.out.println("\nYou need to put in a number!\n");
        }
        return diceAmount();
    }
    public static int rollDice(Players player, int rollAmount){
        int playerSum = 0;
        Random random = new Random();
        for (int i = 0; i <rollAmount; i++) {
            int newDice = random.nextInt(1,7);
            System.out.println(player.getPlayer() + " rolled: " + newDice);
            playerSum += newDice;
        }
        System.out.println(player.getPlayer() + " rolled a total of: " + playerSum);
        return playerSum;

    }
    public static void winnerWinnerChickenDinner(Players playerOne, Players playerTwo, int sumOne, int sumTwo){
        if (sumOne > sumTwo){
            System.out.println("\n" + playerOne.getPlayer() + " Wins with a total of: " + sumOne + "!");
        }
        else if (sumTwo > sumOne) {
            System.out.println("\n" + playerTwo.getPlayer() + " Wins with a total of: " + sumTwo + "!");
        }
        else {
            System.out.println("\n" + "It´s a tie!!!! Both players had the same total of: " + sumOne);
        }
    }
}