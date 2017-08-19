package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    //2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        //5. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
        //6. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        cReader.close();

        //7. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
        //8. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(byteArray);
        PrintStream oldPrintStream = System.out;
        System.setOut(newPrintStream);

        //9. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
        testString.printSomething();

        System.setOut(oldPrintStream);

        //10. Метод main(String[] args) класса Solution должен записывать в файл строку выведенную методом printSomething() (используй FileOutputStream), и дублировать её в консоль.
        //11. Поток записи в файл (FileOutputStream) должен быть закрыт.
        FileOutputStream file = new FileOutputStream(fileName);
        file.write(byteArray.toByteArray());
        System.out.println(byteArray.toString());
        file.close();
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

