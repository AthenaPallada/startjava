package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя первого игрока - ");
        String name1 = input.nextLine();
        Player player1 = new Player(name1);
        System.out.print("Введите имя второго игрока - ");
        String name2 = input.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1,player2);
        String answer = "yes";
            do {
                if("yes".equals(answer)) {
                    game.startGame();
                }
                System.out.println("Хотите продолжить вычисления? [y/n]");
                answer = input.nextLine();
            } while (!"no".equals(answer));
    }
}