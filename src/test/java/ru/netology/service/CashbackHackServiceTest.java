package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void missingAmount() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=900;
        int expected = 100;
        int astual=cashbackHackService.remain(amount);
        assertEquals(expected,astual);
    }

}