package com.startjava.lesson_2_3.animal;
public class Wolf {
    private String name = "Shine";
    private String gender = "Female";
    private String color = "Pure white";
    private float weight = 42.2f;
    private int age = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == "") {
            System.out.println("пустая строка");
        } else {
            this.name = name;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void go() {
        System.out.println("Пойти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежать");
    } 

    public void howl() {
        System.out.println("Выть");
    }  

    public void hunt() {
        System.out.println("Охотиться");
    }  
}