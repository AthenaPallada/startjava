package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {

    private Player player1;
    private Player player2;
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    private int secretNum = rnd.nextInt(100 + 1);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Число загаданное компьютером - " + secretNum);
        System.out.println("У каждого игрока по 10 попыток.");
        player1.erase();
        player2.erase();
        boolean tryOver1 = false;
        boolean tryOver2 = false;

        while(!tryOver1 && !tryOver2) {
            inputNum(player1);
            if (guessNums(player1)) {
                break;
            }
            tryOver1 = isTryOver(player1);

            inputNum(player2);
            if (guessNums(player2)) {
                break;
            }
            tryOver2 = isTryOver(player2);
        }
        showAttempts(player1);
        showAttempts(player2);
    }

    private boolean isTryOver(Player player) {
        if (player.getCounter() > 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void inputNum(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean guessNums(Player player) {
        int num = player.getNumber();
        if (num == secretNum) {
            System.out.println(player.getName() + " угадал число " + num + " c " + player.getCounter() + " попытки");
        } else {
            String result = num < secretNum ? " меньше " : " больше ";
            System.out.println("Данное число " + num + result + "загаданного");
        }
        return (num == secretNum);
    }

    private void showAttempts(Player player) {
        System.out.printf("Введенные числа игрока " + player.getName() + " : ");
        for (int number : player.getEnteredNums()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}