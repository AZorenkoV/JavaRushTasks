package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    //2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArray);
        PrintStream oldPrintStream = System.out;

        //6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out
        System.setOut(printStream);

        //7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        testString.printSomething();

        //8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
        String outputString = byteArray.toString().replaceAll("te", "??");

        System.setOut(oldPrintStream);
        System.out.println(outputString);

    }

    //1. Класс Solution должен содержать класс TestString.
    public static class TestString {
        //3. Класс TestString должен содержать публичный void метод printSomething().
        //4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
