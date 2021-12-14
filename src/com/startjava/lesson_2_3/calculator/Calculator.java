package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {
    private int number1;
    private char operator;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    void calculate() {
        int result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Результат операции: " + result);
                break;
            case'-':
                result = number1 - number2;
                System.out.println("Результат операции: " + result);
                break;
            case'*':
                result = number1 * number2;
                System.out.println("Результат операции: " + result);
                break;
            case'/':
                result = number1 / number2;
                System.out.println("Результат операции: " + result);
                break;
            case'^': 
                result = 1;
                for (int i = 1; i <= number2; i++) {
                    result *= number1;      
                }
                System.out.println("Результат операции: " + result); 
                break;
            case'%':
                result = number1 % number2;
                System.out.println("Результат операции: " + result);
                break;
        }
    }
}