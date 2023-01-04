package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void calculateBonus(){
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateAnotherBonus(){
        int amount = 800;
        int expected = 200;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void calculateBonusIfZero(){
        int amount = 0;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void calculateBonusIfThousand(){
        int amount = 1000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }

}