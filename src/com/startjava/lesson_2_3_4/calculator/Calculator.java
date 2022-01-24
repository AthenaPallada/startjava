package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import static java.lang.Math.*;

public class Calculator {
    private int number1;
    private char mathSign;
    private int number2;

    public int calculate(String expression) {
        int result;
        String[] partsExpression = expression.split(" ");
        number1 = Integer.parseInt(partsExpression[0]);
        mathSign = partsExpression[1].charAt(0);
        number2 = Integer.parseInt(partsExpression[2]);
        switch (mathSign) {
            case '+':
                return(addExact(number1, number2));
            case '^':
                return((int) pow(number1, number2));
            case '-':
                return(subtractExact(number1, number2));
            case '*':
                return(multiplyExact(number1, number2));
            case '/':
                return(number1 / number2);
            case '%':
                return floorMod(number1, number2);
            default:
                System.out.println("Вы ввели неправильный знак");
                return -1;
        }   
    }
}