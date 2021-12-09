package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To40Then4() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 0;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03To00Then3() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 0;
        int y2 = 0;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To34Then5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}