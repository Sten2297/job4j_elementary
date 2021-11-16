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
        float expected = 2;
        float out = Converter.rubleToEuro(a);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float out2 = Converter.rubleToDollar(a);
        float expected2 = 2;
        boolean passed2 = expected2 == out;
        System.out.println("140 rubles are " + out2 + ". Test result : " + passed2);

    }
}
