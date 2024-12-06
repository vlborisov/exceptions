package ru.sportmaster.homework_1_2;

import ru.sportmaster.homework_1_2.*;

public class Pincodes {

    private static long[] pincodes = new long[] {123432123, 903476122, 517738000, 991209287};

    public static long getPincodeById(){
        try {
            return pincodes[InputUtil.input()-1];
        }catch (ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Введено недопустимое число. На ввод допустимы числа от 1 до 4 включительно");
        }
    }


}
