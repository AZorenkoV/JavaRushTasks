package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());
        String result;

        if(number > 0) {
            result = "положительное";
            if((number%2) == 0)
                result += " четное число";
            else
                result += " нечетное число";
        } else if(number < 0) {
            result = "отрицательное";
            if((number%2) == 0)
                result += " четное число";
            else
                result += " нечетное число";
        } else
            result = "ноль";

        System.out.println(result);
    }
}
