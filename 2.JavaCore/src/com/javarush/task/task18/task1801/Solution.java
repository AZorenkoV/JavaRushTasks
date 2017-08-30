package com.javarush.task.task18.task1801;

import java.io.*;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int maxByte = 0;
        while (file.available() > 0) {
            int now = file.read();
            if(maxByte < now) maxByte = now;
        }
        file.close();
        System.out.println(maxByte);
    }
}
