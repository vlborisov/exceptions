package ru.sportmaster.homework_1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    private static final Scanner in = new Scanner(System.in);

    private InputUtil() {
    }

    private static double input() {
        try {
            return in.nextDouble();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Должно быть введено целое или дробное число в формате: 1,1");
        }
    }

    public static double inputDividend() {
        System.out.println("Введите числитель: ");
        return input();

    }

    public static double inputDivisor() {
        System.out.println("Введите знаменатель: ");
        double divisor = input();
        if (divisor == 0) {
            throw new ArithmeticException("Знаменатель не может быть равен 0");
        } else {
            return divisor;
        }
    }
}
