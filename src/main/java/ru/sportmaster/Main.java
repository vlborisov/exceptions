package ru.sportmaster;

import ru.sportmaster.homework_1_1.Calculate;
import ru.sportmaster.homework_1_2.Pincodes;

public class Main {
    public static void main(String[] args) {
        //первое задание
        Calculate calculator = new Calculate();
        calculator.division();
        calculator.printResult();
        //второе задание
        System.out.println(Pincodes.getPincodeById());
    }
}