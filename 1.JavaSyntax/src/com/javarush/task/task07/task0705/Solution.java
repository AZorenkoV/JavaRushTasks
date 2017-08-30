package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArrayFirst = new int[10], smallArraySecond = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < bigArray.length; i++) {
            if(i < 10) smallArrayFirst[i] = bigArray[i];
            else smallArraySecond[i-10] = bigArray[i];
        }

        for (int i = 0; i < smallArraySecond.length; i++) {
            System.out.println(smallArraySecond[i]);
        }
    }
}
