package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        String result;

        if((number > 0) && (number < 1000)) {
            if ((number % 2) == 0)
                result = "четное";
            else
                result = "нечетное";

            if ((number / 100) > 0)
                result += " трехзначное число";
            else if ((number / 10) > 0)
                result += " двузначное число";
            else
                result += " однозначное число";
            System.out.println(result);
        }
    }
}
