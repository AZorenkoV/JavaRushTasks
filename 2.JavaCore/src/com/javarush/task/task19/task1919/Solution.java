package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа НЕ должна считывать данные с консоли.
        Map<String, Float> date = new TreeMap<>();

        //2. Программа должна считывать содержимое файла (используй FileReader).
        //3. Поток чтения из файла (FileReader) должен быть закрыт.
        try(FileReader file = new FileReader(args[0])) {
            BufferedReader bReader = new BufferedReader(file);
            while (bReader.ready()) {
                String [] value = bReader.readLine().split(" ");
                if(date.containsKey(value[0])) {
                    date.put(value[0], date.get(value[0]) + Float.parseFloat(value[1]));
                } else {
                    date.put(value[0], Float.parseFloat(value[1]));
                }
            }
        }

        //4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
        for (Map.Entry<String, Float> item :
                date.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
}