package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        x = x * x + 1;
        return x;
    }

    public static int func2(int x) {
        x = 1 / x;
        return x;
    }

    public static void main(String[] args) {
        int total = MathFunc.func1(3) + MathFunc.func2(5);
        int result3 = func1(100);
        System.out.println(result3);

    }
}
