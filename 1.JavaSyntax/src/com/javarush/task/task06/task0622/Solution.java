package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 5; i++) {
            if(a > b) {
                a = a + b;
                b = a - b;
                a = a - b;
            }
            if(b > c) {
                b = b + c;
                c = b - c;
                b = b - c;
            }
            if(c > d) {
                c = c + d;
                d = c - d;
                c = c - d;
            }
            if(d > e) {
                d = d + e;
                e = d - e;
                d = d - e;
            }
        }

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);

    }
}
