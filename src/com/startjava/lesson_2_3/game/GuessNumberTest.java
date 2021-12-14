package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessNumber game = new GuessNumber();

        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(input.nextLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(input.nextLine());

        int targetNumber = (int) (Math.random() * 100);
        int guess1;
        int guess2; 
        do {
            System.out.print(playerOne.getName() + " введите число (от 0 - до 100): ");
            guess1 = input.nextInt();
                if (guess1 > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (guess1 < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                }
            System.out.print(playerTwo.getName() + " игрок введите число (от 0 - до 100): ");
            guess2 = input.nextInt();
                if (guess2 > targetNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (guess2 < targetNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                }

        } while (guess1 != targetNumber & guess2 != targetNumber);
                System.out.println("Поздравляю, число угадано");       
    
        game.startGame();

    }
}