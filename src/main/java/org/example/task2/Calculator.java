package org.example.task2;

public class Calculator {
    public int value1;
    public int value2;

    public int add(int value1, int value2) {
        return value1 + value2;

    }

    public int subtract(int value1, int value2) {
        return value1 - value2;

    }

    public int multiply(int value1, int value2) {
        return value1 * value2;

    }

    public double divide(int value1, int value2) {
        if (value2 == 0) {
            throw new IllegalArgumentException("Ділення на нуль неможливе");
        }
        return value1 / value2;

    }

    public double sqrt(int value1) {
        if (value1 < 0) {
            throw new IllegalArgumentException("Квадратного кореня з від'ємних чисел не існує");
        }
        return Math.sqrt(value1);
    }

}

