package com.Alexis.test;

import com.Alexis.diceGame.Players;
import com.Alexis.diceGame.Scanning;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void Players(){
        Players player1 = new Players("benny",1);
        assertEquals("benny",player1.getPlayer());
    }
    @Test
    void diceAmount() {
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            int newDice = random.nextInt(1, 7);
            assertNotEquals(0,newDice);
        }
    }
}
