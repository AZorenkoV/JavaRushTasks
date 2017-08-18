package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Считывать с консоли ничего не нужно.
        //2. Создай поток для чтения из файла, который приходит первым параметром в main.
        FileReader fileReader = new FileReader(args[0]);

        //3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
        Map<Character,Integer> symbols = new TreeMap<>();
        while(fileReader.ready()) {
            int symbol = fileReader.read();
            if(symbols.get((char)symbol) != null) {
                int temp = symbols.get((char)symbol).intValue();
                symbols.put((char) symbol, ++temp);
            } else {
                symbols.put((char) symbol, 1);
            }
        }

        //4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
        for (Map.Entry<Character, Integer> item : symbols.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        //5. Поток для чтения из файла должен быть закрыт.
        fileReader.close();
    }
}
