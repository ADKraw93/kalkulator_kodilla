package com.kodilla.kodilla_4_6_kalkulator;

public class Calculator {

    public double addNumbers(double a, double b){
        return a + b;
    }

    public double subtractNumbers(double a, double b){
        return a - b;
    }

    public static void main(String args[]){
        Calculator calc = new Calculator();
        double result1 = calc.addNumbers(1.5, 2.33);
        System.out.println(result1);
        double result2 = calc.subtractNumbers(1.5, 2.33);
        System.out.println(result2);
    }
}
