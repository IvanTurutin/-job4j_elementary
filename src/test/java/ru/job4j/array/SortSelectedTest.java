package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

     @Test
    public void whenSort2() {
        int[] data = new int[] {3, 4, 1, 2, 5, 8, 6, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 1, 2, 3, 4, 5, 6, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }
}