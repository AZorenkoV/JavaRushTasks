package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] words = s.split(" ");

        //напишите тут ваш код
        s = "";
        for (String item :
                words) {
            if(item != null && !item.equals("")) s += item.substring(0,1).toUpperCase() + item.substring(1) + " ";
        }
        s = s.trim();

        System.out.println(s);
    }
}
