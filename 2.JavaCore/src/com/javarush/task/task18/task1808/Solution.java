package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        int part1 = file1.available()/2 + ((file1.available()%2) > 0 ? 1 : 0);
        int part2 = file1.available()-part1;

        byte[] buffer = new byte[part1];
        file1.read(buffer);
        file2.write(buffer);
        file2.flush();
        buffer = new byte[part2];
        file1.read(buffer);
        file3.write(buffer);
        file3.flush();

        file1.close();
        file2.close();
        file3.close();

    }
}
