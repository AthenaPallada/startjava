package com.startjava.lesson_1.game;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Компьютер загадывает число (от 0 - до 100): ");
        int numberСomputer = input.nextInt();
        int guess = 0;
        
        while(guess != numberСomputer) {
            System.out.print("Участник ведите число (от 0 - до 100): ");
            guess = input.nextInt();
            if (guess > numberСomputer) {
            System.out.println("Данное число больше того, что загадал компьютер");
            } else if (guess < numberСomputer) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляю, число угадано");       
    }
}