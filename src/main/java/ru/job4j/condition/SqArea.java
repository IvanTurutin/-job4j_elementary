package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double rsl = k * Math.pow(h, 2);
        return rsl;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double h;
        double l;
        double result1 = SqArea.square(p, k);
        h = Math.sqrt(result1 / k);
        l = k * h;
        System.out.println(" p = " + p + ", k = " + k + ", s = " + result1 + ", h = " + h + ", L = " + l);
    }
}
