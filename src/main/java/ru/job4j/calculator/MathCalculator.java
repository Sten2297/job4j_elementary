package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double func1(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double itog(double first, double second) {
        return sumAndMultiply(first, second) + func1(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + itog(10, 20));
    }
}
