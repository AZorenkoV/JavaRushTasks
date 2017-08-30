package com.javarush.task.task18.task1805;

import java.io.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int[] innerByte = new int[256];
        while (file.available() > 0) innerByte[file.read()]++;
        file.close();

        for (int i = 0; i < innerByte.length; i++) if(innerByte[i] != 0) System.out.print(i + " ");
    }
}
