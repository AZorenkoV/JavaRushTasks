package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (int i = 1; i < n; i++) {
            int temp = Integer.parseInt(reader.readLine());
            maximum = maximum > temp ? maximum : temp;
        }

        System.out.println(maximum);
    }
}
