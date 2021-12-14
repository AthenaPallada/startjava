package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
    this.pl1 = pl1;
    this.pl2 = pl2;
    }

    public void startGame() {
        Random rnd = new Random();
        int secretNum = rnd.nextInt(100 + 1);
        Scanner input = new Scanner(System.in);

        while(true) {
        System.out.print(pl1.getName() + ", введите число (от 0 - до 100): ");
        int num = input.nextInt();
            if (num == secretNum) {
                System.out.println("Победил игрок " + pl1.getName());
                break;
            } else if (num > secretNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

        System.out.print(pl2.getName() + ", введите число (от 0 - до 100): ");
        num = input.nextInt();
            if (num == secretNum) {
                System.out.println("Победил игрок " + pl1.getName());
                break;
            } else if (num > secretNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}