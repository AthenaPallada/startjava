package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        System.out.println("Выведите символы кодировки Unicode в диапазоне [33, 126]");
        for (char i = 33; i < 126; i++) {
            System.out.print(" = " + i + "\t");
        }
    }
}