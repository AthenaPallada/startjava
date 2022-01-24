package com.startjava.lesson_2_3_4.animal;

import java.util.Scanner;
public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name);
        // wolfOne.setName("Ice");
        // System.out.println("name = " + wolfOne.getName());
        // wolfOne.setGender("Female");
        // System.out.println("gender = " + wolfOne.getGender());
        // wolfOne.setColor("Blue");
        // System.out.println("color = " + wolfOne.getColor());
        // wolfOne.setWeight(45.5f);
        // System.out.println("age = " + wolfOne.getWeight());
        // wolfOne.setAge(5);
        // System.out.println("age = " + wolfOne.getAge());
    }  
}