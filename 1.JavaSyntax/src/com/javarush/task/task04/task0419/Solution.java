package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        int maxAB;
        int maxCD;

        if(a >= b)
            maxAB = a;
        else
            maxAB = b;
        if(c >= d)
            maxCD = c;
        else
            maxCD = d;
        if(maxAB >= maxCD)
            System.out.println(maxAB);
        else
            System.out.println(maxCD);
    }
}
