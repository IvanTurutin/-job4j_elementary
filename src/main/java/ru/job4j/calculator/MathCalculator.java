package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double difAndQuot(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.quotient(first, second);
    }

    public static double sumAndMultiplyAndDifAndQuot(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second) + MathFunction.difference(first, second)
                + MathFunction.quotient(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDifAndQuot(10, 20));

    }

}
