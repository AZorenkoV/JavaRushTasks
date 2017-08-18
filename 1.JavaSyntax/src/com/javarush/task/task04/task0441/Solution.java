package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if ((a != b) && (a != c) && (b != c)) {
            if ((a > b)) {
                if ((a < c)) {
                    System.out.println(a);
                } else {
                    if (b < c)
                        System.out.println(c);
                    else
                        System.out.println(b);
                }
            } else {
                if (b < c) {
                    System.out.println(b);
                } else {
                    if (a < c)
                        System.out.println(c);
                    else
                        System.out.println(a);
                }
            }
        } else {
            if ((a == b) && (a == c)) {
                System.out.println(a);
            } else {
                if((a == b) || (a == c))
                    System.out.println(a);
                else
                    System.out.println(c);
            }
        }
    }
}
