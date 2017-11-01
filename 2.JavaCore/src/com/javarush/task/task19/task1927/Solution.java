package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
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
        PrintStream oldStream = System.out;
        //6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
        System.setOut(printStream);
        //7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        testString.printSomething();
        System.setOut(oldStream);
        int countLine = 1;
        //8. Метод main(String[] args) класса Solution должен модифицировать строки(вставлять контекстную рекламу) выведенные методом printSomething() согласно заданию, и выводить её в консоль.
        for (byte b :
                byteArray.toString().getBytes()) {
            System.out.print((char)b);
            if(b == '\n') {
                if (countLine%2==0) System.out.println("JavaRush - курсы Java онлайн");
                countLine++;
            }
        }
    }

    //1. Класс Solution должен содержать класс TestString.
    public static class TestString {
        //3. Класс TestString должен содержать публичный void метод printSomething().
        //4. Метод printSomething() класса TestString должен выводить на экран строки: "first","second","third","fourth","fifth".
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
