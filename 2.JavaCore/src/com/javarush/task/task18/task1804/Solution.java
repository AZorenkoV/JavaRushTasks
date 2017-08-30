package com.javarush.task.task18.task1804;

import java.io.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int[] innerByte = new int[256];
        while (file.available() > 0) innerByte[file.read()]++;

        int minCount = 0;
        for (int i : innerByte) if(i > 0) minCount = i;
        for (int i = 0; i < innerByte.length; i++) if((minCount > innerByte[i])&&(innerByte[i]>0)) minCount = innerByte[i];
        for (int i = 0; i < innerByte.length; i++) if(minCount == innerByte[i]) System.out.print(i + " ");

        file.close();
        reader.close();
    }
}
