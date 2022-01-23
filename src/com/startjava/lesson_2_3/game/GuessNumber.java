package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = rnd.nextInt(100) + 1;
        System.out.println("Число загаданное компьютером - " + secretNumber);
        System.out.println("У каждого игрока по 10 попыток.");
        player1.clear();
        player2.clear();
        boolean tryOver1 = false;
        boolean tryOver2 = false;

        while(!tryOver1 && !tryOver2) {
            inputNumber(player1);
            if (guessNumbers(player1)) {
                break;
            }
            tryOver1 = isTryOver(player1);

            inputNumber(player2);
            if (guessNumbers(player2)) {
                break;
            }
            tryOver2 = isTryOver(player2);
        }
        showNumbers(player1);
        showNumbers(player2);
    }

    private boolean isTryOver(Player player) {
        if (player.getCounter() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean guessNumbers(Player player) {
        int num = player.getNumber();
        if (num == secretNumber) {
            System.out.println(player.getName() + " угадал число " + num + " c " + player.getCounter() + " попытки");
        } else {
            String result = num < secretNumber ? " меньше " : " больше ";
            System.out.println("Данное число " + num + result + "загаданного");
        }
        return (num == secretNumber);
    }

    private void showNumbers(Player player) {
        System.out.println("Введенные числа игрока " + player.getName() + " : ");
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}