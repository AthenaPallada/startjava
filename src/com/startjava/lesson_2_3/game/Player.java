package com.startjava.lesson_2_3.game;

public class Player {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //      this.name = name;
    // } 

    // public void setNumber(int number) {
    //     this.number = number;
    // } 

    public Player () {
    }

    public Player (String name) {
        this.name = name;
    }
}