package ru.sportmaster.homework_1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    private static final Scanner in = new Scanner(System.in);

    private InputUtil() {
    }

    public static int input() {
        System.out.println("Введите число от 1 до 4 включительно:");
        try {
            return in.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Должно быть введено число от 1 до 4 включительно");
        }
    }

}

