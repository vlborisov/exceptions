package ru.sportmaster.homework_1_1;

import static ru.sportmaster.homework_1_1.InputUtil.inputDividend;
import static ru.sportmaster.homework_1_1.InputUtil.inputDivisor;

public class Calculate {
    private double dividend;
    private double divisor;
    private double result;

    public Calculate() {
        this.dividend = inputDividend();
        this.divisor = inputDivisor();
    }

    public double division() {
        this.result = this.dividend / this.divisor;
        return this.result;
    }

    public void printResult(){
        System.out.println("Результат деления: " + this.division());
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "dividend=" + dividend +
                ", divisor=" + divisor +
                '}';
    }
}
