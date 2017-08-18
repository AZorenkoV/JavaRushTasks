package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.*;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {

        try(FileReader file = new FileReader(new File(Statics.FILE_NAME))) {
            BufferedReader reader = new BufferedReader(file);
            while (reader.ready()){
                lines.add(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
