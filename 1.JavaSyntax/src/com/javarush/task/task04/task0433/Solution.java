package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x=0, y=0;

        while(y++ < 10){
            while(x++ < 10){
                System.out.print("S");
            }
            System.out.println();
            x=0;
        }


    }
}
