package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = p / (2 * (k + 1));
        return rsl;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double s;
        double l;
        double result1 = SqArea.square(p, k);
        l = k * result1;
        s = l * result1;
        System.out.println(" p = " + p + ", k = " + k + ", s = " + s + ", h = " + result1 + ", L = " + l);
    }

}
