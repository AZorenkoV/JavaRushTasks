package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String name = bf.readLine();
        String age = bf.readLine();

        if(Integer.parseInt(age) > 20)
            System.out.println("И 18-ти достаточно");
    }
}
