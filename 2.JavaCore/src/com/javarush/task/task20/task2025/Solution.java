package com.javarush.task.task20.task2025;

import java.text.SimpleDateFormat;
import java.util.*;

/*
Алгоритмы-числа

Модуль безбожно "одолжен" https://github.com/shamily/ArmstrongNumbers

*/
public class Solution {


    public static long[] getNumbers(long N) {
        int length = Long.toString(N).length();
        if (Long.toString(N).charAt(0) == '-') length = 0;
        List<Long> genList = ArmstrongNumbersMultiSetLongOpt.generate(length);
        int index = 0;
        for (Long item : genList
                ) {
            if(item >= N) break;
            index++;
        }
        genList = genList.subList(0, index);
        long [] result = new long[genList.size()];
        index = 0;
        for (Long item : genList
                ) {
            result[index++] = item;
        }
        return result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(getNumbers(102400)));
        //for (long i = 0; i < Long.MAX_VALUE; i++) {}
        System.out.println(Arrays.toString(getNumbers(Long.MIN_VALUE )));
        //System.out.println(Arrays.toString(getNumbers(1_000_000)));
        long end = System.currentTimeMillis() - start;
        long memore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        SimpleDateFormat sdf = new SimpleDateFormat("ss.SSS");
        System.out.println("Time = " + sdf.format(new Date(end)));
        System.out.println("Memory = " + memore / 1048576);
    }
}
