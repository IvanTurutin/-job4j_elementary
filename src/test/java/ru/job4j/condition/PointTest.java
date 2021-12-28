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
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To40Then4() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 0;
        double expected = 4;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03To00Then3() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 0;
        int y2 = 0;
        double expected = 3;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To34Then5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double expected = 5;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To345Then7Point071() {
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 3;
        int y2 = 4;
        int z2 = 5;
        double expected = 7.071;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double out = point1.distance3D(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}