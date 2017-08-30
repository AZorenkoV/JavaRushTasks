package com.javarush.task.task18.task1802;

import java.io.*;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int minByte = file.read();
        while (file.available() > 0) {
            int now = file.read();
            if(minByte > now) minByte = now;
        }
        file.close();
        System.out.println(minByte);
    }
}
