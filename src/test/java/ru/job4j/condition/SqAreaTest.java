package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K2Square8() {
        int p = 12;
        int k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Square3() {
        int p = 8;
        int k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}