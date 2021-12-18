package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(array);
        int[] excepted = new int[] {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(excepted, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(array);
        int[] excepted = new int[] {7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(excepted, result);
    }
}