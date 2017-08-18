package com.javarush.task.task15.task1527;

import java.io.*;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String obj = "";
        StringBuilder outline = new StringBuilder();
        List<String> lines = new ArrayList<>();
        line = line.substring(line.indexOf("?")+1).trim();
        for (String item: line.split("&")
             ) {
            lines.add(item);
            if(item.contains("=")) {
                if (item.substring(0,item.indexOf("=")).equals("obj")) obj = item.substring(item.indexOf("=")+1);
                outline.append(item.substring(0,item.indexOf("=")) + " ");
            }
            else outline.append(item + " ");
        }
        System.out.println(outline);
        if (!obj.isEmpty()){
            try {
                alert(Double.parseDouble(obj));
            } catch (NumberFormatException e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
