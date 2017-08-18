package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        InputStream is = new FileInputStream(fileName);

        while (is.available() > 0) {
            System.out.print((char)is.read());
        }
        System.out.println();

        is.close();
        bf.close();
    }
}