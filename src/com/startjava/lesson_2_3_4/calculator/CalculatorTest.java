package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while ("yes".equals(answer)) {   
            System.out.print("Введите математическое выражения: ");
            String expression = input.nextLine();
            System.out.println("Результат = " + calculator.calculate(expression));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = input.nextLine();
            } while (!"yes".equals(answer) && !"no".equals(answer)); 
        }
    }
}