package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle() {
        this(1, 1, 1);
    }

    public Circle(int x) {
        this(x, 1 ,1);
    }

    public Circle(int x, int y) {
        this(x, y, 1);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}