package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float a = 140;
        System.out.println(a + " rubles are " + Converter.rubleToEuro(a) + " euro.");
        System.out.println(a + " rubles are " + Converter.rubleToDollar(a) + " dollars.");
    }
}
