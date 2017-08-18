package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 1, number;
        double summ = 0;

        number = Integer.parseInt(bf.readLine());
        while(number != -1){
            count++;
            summ += number;
            number = Integer.parseInt(bf.readLine());
        }

        System.out.println(summ/(count-1));
    }
}

