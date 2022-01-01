package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int number1;
    private char operator;
    private int number2;

    void calculate(String expression) {
        int result;
        String[] array = expression.split(" ");
        number1 = Integer.parseInt(array[0]);
        operator =  array[1].charAt(0);
        number2 = Integer.parseInt(array[2]);
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
                result = (int) Math.pow(number1, number2);
                System.out.println("Результат операции: " + result); 
                break;
            case'%':
                result = number1 % number2;
                System.out.println("Результат операции: " + result);
                break;
        }
    }
}