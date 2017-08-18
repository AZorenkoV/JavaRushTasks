package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while(true) {
                list.add(Integer.parseInt(bf.readLine()));
            }
        } catch (NumberFormatException e) {
            for (Integer item :
                    list) {
                System.out.println(item);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
