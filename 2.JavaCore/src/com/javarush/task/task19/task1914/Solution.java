package com.javarush.task.task19.task1914;

/* 
Решаем пример
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
        PrintStream oldPrintStrim = System.out;

        //6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
        System.setOut(printStream);
        //7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        testString.printSomething();
        //8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
        String [] operators = byteArray.toString().split(" ");
        int result = 0;
        switch(operators[1]){
            case "+" : result = Integer.parseInt(operators[0]) + Integer.parseInt(operators[2]);
                break;
            case "-" : result = Integer.parseInt(operators[0]) - Integer.parseInt(operators[2]);
                break;
            case "*" : result = Integer.parseInt(operators[0]) * Integer.parseInt(operators[2]);
                break;
        }
        System.setOut(oldPrintStrim);
        System.out.println(byteArray.toString().replace("\n" , "") + result);


    }

    //1. Класс Solution должен содержать класс TestString.
    public static class TestString {
        //3. Класс TestString должен содержать публичный void метод printSomething().
        //4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

