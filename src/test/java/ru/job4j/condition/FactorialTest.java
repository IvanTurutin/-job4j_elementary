package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class FactorialTest {

    @Test
    public void when8FactorialThen() {
        int n = 8;
        int result = Factorial.calc(n);
        int excepted = 40320;
        Assert.assertEquals(result, excepted);
    }

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int excepted = 120;
        Assert.assertEquals(result, excepted);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = Factorial.calc(n);
        int excepted = 1;
        Assert.assertEquals(result, excepted);
    }

}