package com.Alexis.test;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void toLower(){
        String quit = "No".toLowerCase();
        assertEquals("no",quit);
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
