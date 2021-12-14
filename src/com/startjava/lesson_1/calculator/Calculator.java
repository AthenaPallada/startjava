package com.startjava.lesson_1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ведите первое число: ");
        int number1 = input.nextInt();
        System.out.println("Ведите второе число: ");
        int number2 = input.nextInt();
        System.out.println("Какую операцию выберите? ('+', '-', '*', '/', '^', '%')");
        char operator = input.next().charAt(0);
        int result = 0;
        
        if (operator == '+') {
            result = number1 + number2;
            System.out.println("Результат операции: " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println("Результат операции: " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println("Результат операции: " + result);
        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println("Результат операции: " + result);
        } else if (operator == '^') {
            int result1 = 1;
            for (int i = 1; i <= number2; i++) {
                result1 *= number1;      
            }
           System.out.println("Результат операции: " + result1); 
        } else if(operator == '%') {
            result = number1 % number2;
            System.out.println("Результат операции: " + result);
        }
    }
}