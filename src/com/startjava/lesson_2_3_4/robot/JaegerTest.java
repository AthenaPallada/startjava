package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 1.722f, 9, 8, 6);
        System.out.println("Характеристика первого робота:");
        System.out.println(crimsonTyphoon);
        crimsonTyphoon.drift();
        crimsonTyphoon.useWeapon();

        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);
        System.out.println("Характеристика второго робота:");
        System.out.println(chernoAlpha);
        chernoAlpha.drift();
        chernoAlpha.move();
    }
}