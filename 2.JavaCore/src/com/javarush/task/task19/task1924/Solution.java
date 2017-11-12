package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    //1. Класс Solution должен содержать публичное статическое поле map типа Map, которое должно быть сразу проинициализировано.
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    //7. Класс Solution должен содержать статический блок, в котором добавляются в map тринадцать пар.
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        //2. Программа должна считывать имя файла с консоли (используй BufferedReader).
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        //3. BufferedReader для считывания данных с консоли должен быть закрыт.
        cReader.close();
        //4. Программа должна считывать содержимое файла (используй FileReader).
        //5. Поток чтения из файла (FileReader) должен быть закрыт.
        try(FileReader fileReader = new FileReader(fileName)){
            //6. Программа должна выводить в консоль все строки из файла, но числа должны быть заменены на слова из словаря map.
            BufferedReader fReader = new BufferedReader(fileReader);
            while (fReader.ready()){
                StringBuilder line = new StringBuilder();
                String[] words = fReader.readLine().split(" ");
                for (String item :
                        words) {
                    Integer number = null;
                    try{
                        number = Integer.parseInt(item);
                    } catch (NumberFormatException e) {
                    }
                    if (map.containsKey(number)) line.append(" " + map.get(number));
                    else line.append(" " + item);
                }
                System.out.println(line.toString().trim());
            }
            //fReader.close();
            //fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
