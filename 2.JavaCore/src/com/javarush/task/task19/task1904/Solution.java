package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    //1. PersonScanner должен быть интерфейсом.
    //2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.

    public static class PersonScannerAdapter implements PersonScanner{
        //3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
        private Scanner fileScanner;

        //4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
        PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }


        //6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
        @Override
        public Person read() throws IOException {
            return null;
        }

        //5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
