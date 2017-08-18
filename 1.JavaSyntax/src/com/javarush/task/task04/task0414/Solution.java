package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bf.readLine());
        int days = 365;
        if((year%4) == 0)
            days = 366;
        if(((year%100) == 0) && !((year%400) == 0))
            days = 365;

        System.out.println("количество дней в году: " + days);
    }
}