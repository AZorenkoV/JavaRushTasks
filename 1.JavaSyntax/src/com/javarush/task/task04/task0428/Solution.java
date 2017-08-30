package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int number;

        number = Integer.parseInt(bf.readLine());
        if(number > 0) count++;
        number = Integer.parseInt(bf.readLine());
        if(number > 0) count++;
        number = Integer.parseInt(bf.readLine());
        if(number > 0) count++;

        System.out.println(count);

    }
}
