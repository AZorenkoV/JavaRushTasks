package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if(a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        if(b < c) {
            b = b + c;
            c = b - c;
            b = b - c;
            if(a < b) {
                a = a + b;
                b = a - b;
                a = a - b;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
