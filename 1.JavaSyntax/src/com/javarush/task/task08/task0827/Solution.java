package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date newYear = new Date();
        Date nowDate = new Date(date);
        newYear.setSeconds(0);
        newYear.setMinutes(0);
        newYear.setHours(0);
        newYear.setMonth(0);
        newYear.setDate(1);
        newYear.setYear(nowDate.getYear());

        long howDays = (nowDate.getTime() - newYear.getTime())/(24*60*60*1000);

        if(howDays % 2 != 0) return true;
        return false;
    }
}
