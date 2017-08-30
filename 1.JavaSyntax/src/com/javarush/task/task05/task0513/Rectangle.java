package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top, left, width, height;

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.height = this.width = 0;
    }

    public void initialize(int top, int left, int width) {
        initialize(top, left);
        this.height = this.width = width;
    }

    public void initialize(int top, int left, int width, int height) {
        initialize(top, left, width);
        this.height = height;
    }

    public void initialize(Rectangle otherRectangle) {
        initialize(otherRectangle.getTop(), otherRectangle.getLeft(),
                otherRectangle.getWidth(), otherRectangle.getHeight());

    }

    public int getTop() {
        return top;
    }

    public int getLeft() {
        return left;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static void main(String[] args) {

    }
}
