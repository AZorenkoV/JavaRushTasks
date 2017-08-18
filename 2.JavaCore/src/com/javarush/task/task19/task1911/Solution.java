package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    //1. Класс Solution должен содержать класс TestString.
    //2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        //5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        PrintStream bytePS = new PrintStream(byteStream);
        //6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
        System.setOut(bytePS);
        //7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        testString.printSomething();
        String outString = byteStream.toString();
        //8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
        System.setOut(ps);
        System.out.println(outString.toUpperCase());


    }

    public static class TestString {
        //3. Класс TestString должен содержать публичный void метод printSomething().
        //4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
