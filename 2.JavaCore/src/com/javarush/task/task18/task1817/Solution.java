package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream( new File(args[0]));
        int countSym = 0, countSpace = 0;

        while (fileInputStream.available() > 0){
            int symb = fileInputStream.read();
            if( symb == 32) countSpace++;
            countSym++;
        }
        System.out.printf("%.2f\n", (double)countSpace/countSym*100);
        fileInputStream.close();
    }
}
