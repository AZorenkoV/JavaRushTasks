package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] homes = new int[15];
        int even = 0, odd = 0;

        for (int i = 0; i < homes.length; i++) {
            homes[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < homes.length; i++) {
            if((i%2) == 0) even += homes[i];
            else odd +=  homes[i];
        }

        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
