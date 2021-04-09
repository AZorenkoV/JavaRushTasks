package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException{
        RandomAccessFile file = new RandomAccessFile(args[0], "rw");
        file.seek(Long.parseLong(args[1]));
        byte [] findText = new byte[args[2].length()];
        file.read(findText, 0, findText.length);
        if(args[2].equals(new String(findText))) {
            file.seek(file.length());
            file.write("true".getBytes());
        } else {
            file.seek(file.length());
            file.write("false".getBytes());
        }
        file.close();
        }
}

