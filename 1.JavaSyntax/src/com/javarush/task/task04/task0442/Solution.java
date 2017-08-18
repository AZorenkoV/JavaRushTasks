package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        int  number = Integer.parseInt(bf.readLine());
        while (number != -1) {
            summa += number;
            //System.out.println(number);
            number = Integer.parseInt(bf.readLine());
        }
        System.out.println(summa-1);
    }
}
