package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        value = value / 70;
        return value;
    }

    public static float rubleToDollar(float value) {
        value = value / 60;
        return value;
    }

    public static void main(String[] args) {
        float a = 140;
        System.out.println(a + " rubles are " + Converter.rubleToEuro(a) + " euro.");
        System.out.println(a + " rubles are " + Converter.rubleToDollar(a) + " dollars.");  //
    }
}
