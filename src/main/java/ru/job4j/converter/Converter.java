package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float inDollar = 120;
        float euro = Converter.rubleToEuro(inEuro);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(inDollar);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float expected = 2;
        boolean passEuro = euro == expected;
        System.out.println(inEuro + " rub. = " + expected + " euro. Test result : " + passEuro);
        boolean passDollar = dollar == expected;
        System.out.println(inDollar + " rub. = " + expected + " dollar. Test result : " + passDollar);
    }
}
