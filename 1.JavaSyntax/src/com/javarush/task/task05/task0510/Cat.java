package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;


    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "white";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "white";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "white";
    }

    public void initialize(int weight, String color) {
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
