package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    //1. Программа НЕ должна считывать данные с консоли.
    //2. Программа должна считывать содержимое файла (используй FileReader).
    //3. Поток чтения из файла (FileReader) должен быть закрыт.
    //4. Программа должна выводить в консоль имена, у которых максимальная сумма.
    public static void main(String[] args) {
        Map<String, Double> date = new HashMap<>();
        try(FileReader file = new FileReader(args[0])){
            BufferedReader fReader = new BufferedReader(file);
            while (fReader.ready()){
                String [] value = fReader.readLine().split(" ");
                if(date.containsKey(value[0])) date.put(value[0], date.get(value[0]) + Double.parseDouble(value[1]));
                else date.put(value[0], Double.parseDouble(value[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Double max = new Double(0);
        for (Map.Entry<String, Double> item:
        date.entrySet()){
            if(item.getValue() > max) max = item.getValue();
        }

        for (Map.Entry<String, Double> item:
                date.entrySet()){
            if(item.getValue().equals(max)) System.out.println(item.getKey());
        }
    }
}