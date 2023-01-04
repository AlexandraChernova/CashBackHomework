package ru.netology.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

class CashbackHackServiceTest {

    @Test
    public void calculateBonus() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void calculateBonusIfZero() {
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void calculateAnotherBonus() {
        int amount = 999;
        int expected = 1;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }


}