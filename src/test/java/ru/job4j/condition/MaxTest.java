package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To7Then7() {
        int first = 3;
        int second = 2;
        int third = 1;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}