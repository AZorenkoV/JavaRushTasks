package com.javarush.task.task18.task1803;

import java.io.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int[] innerByte = new int[128];
        while (file.available() > 0) innerByte[file.read()]++;
        file.close();
        int maxCount = 0;
        for (int i = 0; i < innerByte.length; i++) if(maxCount < innerByte[i]) maxCount = innerByte[i];
        for (int i = 0; i < innerByte.length; i++) if(maxCount == innerByte[i]) System.out.print(i + " ");
    }
}
