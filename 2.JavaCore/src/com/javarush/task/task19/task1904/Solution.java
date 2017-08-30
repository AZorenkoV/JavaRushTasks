package com.javarush.task.task19.task1904;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    //1. PersonScanner должен быть интерфейсом.
    public static void main(String[] args) throws IOException {
        //System.out.println(new PersonScannerAdapter(new Scanner(new FileInputStream("fileTest"))).read());
    }

    //2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
    public static class PersonScannerAdapter implements PersonScanner{

        //3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
        private Scanner fileScanner;

        //4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
        PersonScannerAdapter(Scanner scanner){
            fileScanner = scanner;
        }

        //6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
        @Override
        public Person read() throws IOException {
            String lastName = fileScanner.next();
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            int day = fileScanner.nextInt();
            int month = fileScanner.nextInt()-1;
            int year = fileScanner.nextInt();
            return new Person(firstName, middleName, lastName, new GregorianCalendar(year,month,day).getTime());
        }


        //5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
