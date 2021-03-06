package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[count] = number;
        count++;
    }

    public int getNumber() {
        return numbers[count - 1];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getCount() {
        return count;
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}