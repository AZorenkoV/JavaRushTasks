package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0;
        int negative = 0;
        int number;

        number = Integer.parseInt(bf.readLine());
        if(number > 0) positive++;
        else if(number < 0) negative++;
        number = Integer.parseInt(bf.readLine());
        if(number > 0) positive++;
        else if(number < 0) negative++;
        number = Integer.parseInt(bf.readLine());
        if(number > 0) positive++;
        else if(number < 0) negative++;

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);

    }
}
