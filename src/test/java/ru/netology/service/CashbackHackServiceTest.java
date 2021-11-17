package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void missingAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int astual = cashbackHackService.remain(amount);
        assertEquals(expected, astual);
    }

    @Test
    public void boundaryValuesOfZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int astual = cashbackHackService.remain(amount);
        assertEquals(expected, astual);
    }
    @Test
    public void maximumBoundaryValues() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;
        int astual = cashbackHackService.remain(amount);
        assertEquals(expected, astual);
    }

}