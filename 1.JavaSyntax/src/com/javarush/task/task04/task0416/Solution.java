package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double t = Double.parseDouble(bf.readLine())%5;

        if (t < 3)
            System.out.println("зелёный");
        else if (t < 4)
            System.out.println("желтый");
        else if (t < 5)
            System.out.println("красный");
    }
}