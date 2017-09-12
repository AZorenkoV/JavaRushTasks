package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        //1. Программа НЕ должна считывать данные с консоли.
        //2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
        //3. Поток чтения из файла (FileReader) должен быть закрыт.
        //4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
        //5. Поток записи в файл (FileWriter) должен быть закрыт.
        try(FileReader fileReader = new FileReader(args[0]); FileWriter fileWriter = new FileWriter(args[1])){
            BufferedReader bReeader = new BufferedReader(fileReader);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            while (bReeader.ready()){
                String [] strings = bReeader.readLine().split(" ");
                for (int i = 0, size = strings.length; i < size; i++) {
                    if(strings[i].matches(".*\\d+.*")) bWriter.write(strings[i] + " ");
                }
            }
            bWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
