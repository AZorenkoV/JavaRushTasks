package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for (int y = 0; y < array.length; y++) {
            for (int i = 0; i < array.length; ) {
                if(isNumber(array[i])){
                    int next = i+1;
                    while((next < array.length) && !isNumber(array[next])) next++;
                    if((next < array.length) && (Integer.parseInt(array[i]) < Integer.parseInt(array[next]))){
                        String temp = array[i];
                        array[i] = array[next];
                        array[next] = temp;
                    }
                    i = next;
                } else i++;
            }
            for (int i = 0; i < array.length; ) {
                if(!isNumber(array[i])){
                    int next = i+1;
                    while((next < array.length) && isNumber(array[next])) next++;
                    if((next < array.length) && (isGreaterThan(array[i], array[next]))){
                        String temp = array[i];
                        array[i] = array[next];
                        array[next] = temp;
                    }
                    i = next;
                } else i++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
