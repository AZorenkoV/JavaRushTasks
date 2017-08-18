package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if ((a < 0) || (b < 0)) throw new Exception();

        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if(a!=b) {
            int r = a % b;
            while(r != 0) {
                a = b;
                b = r;
                r = a%b;
            }
        }
        System.out.println(b);
    }
}
