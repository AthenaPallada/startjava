package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner input = new Scanner(System.in);
        char answer = 'y';
        while (answer != 'n') {   
            System.out.print("Введите математическое выражения: ");
            String expression = input.nextLine();
            calculatorOne.calculate(expression);
            do {
                System.out.println("Хотите продолжить вычисления? [y/n]");
                answer = input.next().charAt(0);
            } while (answer != 'y' && answer != 'n'); 
        }
    }
}