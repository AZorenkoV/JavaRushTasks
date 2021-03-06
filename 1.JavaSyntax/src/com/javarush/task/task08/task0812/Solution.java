package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }

        int count=1, maxCount=1;

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) == list.get(i-1)) count++;
            else {
                if(count > maxCount) maxCount = count;
                count = 1;
            }
        }
        if(count > maxCount) maxCount = count;

        System.out.println(maxCount);
    }
}