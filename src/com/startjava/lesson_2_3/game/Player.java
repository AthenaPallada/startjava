package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10]; // создание массива 10
    private int counter;//счетчик
    
    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[counter] = number;
        counter++;
    }

    public int getNumber() {
        return numbers[counter - 1];
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(numbers, counter);
    }

    public int getCounter() {
        return counter;
    }

    public void erase() {
        Arrays.fill(numbers, 0, counter, 0);
        counter = 0;
    }
}