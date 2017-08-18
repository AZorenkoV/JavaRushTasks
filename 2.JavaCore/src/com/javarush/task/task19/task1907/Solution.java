package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна считывать имя файла с консоли (используй BufferedReader).
        //2. BufferedReader для считывания данных с консоли должен быть закрыт.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        cReader.close();

        //3. Программа должна считывать содержимое файла (используй FileReader c конструктором String).
        //5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
        int count = 0;
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        String word = "";
        while (file.ready()){
            String line = file.readLine();
            String [] words = line.split("\\W");
            for (String item: words) {
                if (item.equals("world")) count++;
            }
        }
        System.out.println(count);

        //4. Поток чтения из файла (FileReader) должен быть закрыт.
        file.close();
    }
}
