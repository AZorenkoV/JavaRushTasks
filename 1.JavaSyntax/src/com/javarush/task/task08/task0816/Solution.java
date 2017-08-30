package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Ivanov", new Date("SEPTEMBER 21 1970"));
        map.put("Petrov", new Date("MARCH 8 1999"));
        map.put("Smirnov", new Date("JULY 7 1983"));
        map.put("Egorov", new Date("AUGUST 24 1991"));
        map.put("Bulba", new Date("NOVEMBER 8 1993"));
        map.put("Vasichkina", new Date("MAY 1 1985"));
        map.put("Padolka", new Date("JUNE 13 1981"));
        map.put("Bandera", new Date("JANUARY 1 1909"));
        map.put("Enshtain", new Date("JULY 1 2000"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Date> item = iter.next();
            if ((item.getValue().getMonth() > 4) && (item.getValue().getMonth() < 8)) iter.remove();
        }
    }

    public static void main(String[] args) {

    }
}
