package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        int count = 0;

        while(fileReader.ready()) {
            int symbol = fileReader.read();
            if(((symbol > 64) && (symbol < 91) || (symbol > 96) && (symbol < 123))) count++;
        }

        System.out.println(count);
        fileReader.close();
    }
}
