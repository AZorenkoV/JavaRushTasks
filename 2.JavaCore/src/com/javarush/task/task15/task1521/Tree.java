package com.javarush.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object o) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, o.getClass().getSimpleName()));
    }

    public void info(Number n) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, n.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}
