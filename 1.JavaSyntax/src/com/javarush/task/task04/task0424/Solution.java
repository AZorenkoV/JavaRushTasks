package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(bf.readLine());
        int number2 = Integer.parseInt(bf.readLine());
        int number3 = Integer.parseInt(bf.readLine());

        if((number1 != number2) && (number1 != number3) && (number2 == number3))
            System.out.println(1);
        if((number2 != number1) && (number2 != number3) && (number1 == number3))
            System.out.println(2);
        if((number3 != number1) && (number3 != number2) && (number1 == number2))
            System.out.println(3);
    }
}
