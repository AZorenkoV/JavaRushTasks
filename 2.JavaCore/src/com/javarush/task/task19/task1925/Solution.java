package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

//1. Программа НЕ должна считывать данные с консоли.
public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            StringBuilder line = new StringBuilder();
            while (reader.ready())
                for (String item :
                        reader.readLine().split(" ")) {
                    if(item.length() > 6) line.append(item + " ");
                }
            writer.write(line.toString().trim().replaceAll(" ", ","));
        }
    }
}
