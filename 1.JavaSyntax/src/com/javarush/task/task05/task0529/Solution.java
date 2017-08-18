package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String numberSrt = bf.readLine();
        int summa = 0;
        while (!numberSrt.equals("сумма")) {
            summa += Integer.parseInt(numberSrt);
            numberSrt = bf.readLine();
        }
        System.out.println(summa);
    }
}
