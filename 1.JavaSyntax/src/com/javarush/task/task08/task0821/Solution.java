package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> result = new HashMap<>();

        result.put("Ivanov1", "Ivan1");
        result.put("Ivanov2", "Ivan2");
        result.put("Ivanov3", "Ivan3");
        result.put("Ivanov4", "Ivan1");
        result.put("Ivanov1", "Ivan2");
        result.put("Ivanov5", "Ivan3");
        result.put("Ivanov6", "Ivan4");
        result.put("Ivanov7", "Ivan1");
        result.put("Ivanov8", "Ivan5");
        result.put("Ivanov1", "Ivan6");

        return result;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
