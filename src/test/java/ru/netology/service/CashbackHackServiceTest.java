package ru.netology.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;

class CashbackHackServiceTest {

    @Test
    public void calculateBonus() {
        int amount = 2000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }


}