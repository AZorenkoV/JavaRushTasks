package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int top, int left, int wigth) {
        this(top, left);
        this.width = wigth;
        this.height = wigth;
    }

    public Rectangle(int top, int left, int wigth, int height) {
        this(top, left, wigth);
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.getTop(), rectangle.getLeft(), rectangle.getWidth(), rectangle.getHeight());
    }

    public int getTop() {
        return top;
    }

    public int getLeft() {
        return left;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {

    }
}
