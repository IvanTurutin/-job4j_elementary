package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int maxFirstSecond = max(first, second);
        return maxFirstSecond > third ? maxFirstSecond : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxFirstSecondThird = max(first, second, third);
        return maxFirstSecondThird > fourth ? maxFirstSecondThird : fourth;
    }
}
