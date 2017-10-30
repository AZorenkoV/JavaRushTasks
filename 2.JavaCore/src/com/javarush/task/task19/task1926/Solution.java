package com.javarush.task.task19.task1926;

/* 
Перевертыши
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все символы из файла в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fReader = new BufferedReader(new FileReader(cReader.readLine()))){
            while (fReader.ready()){
                StringBuilder line = new StringBuilder(fReader.readLine());
                System.out.println(line.reverse().toString());
            }
        } catch (Exception e){
                e.printStackTrace();
        }
    }
}
