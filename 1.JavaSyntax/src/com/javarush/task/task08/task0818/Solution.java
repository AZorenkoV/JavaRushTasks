package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> result = new HashMap<>();

        result.put("Ivanov1", 1000);
        result.put("Ivanov2", 400);
        result.put("Ivanov3", 1000);
        result.put("Ivanov4", 500);
        result.put("Ivanov5", 1000);
        result.put("Ivanov6", 1000);
        result.put("Ivanov7", 300);
        result.put("Ivanov8", 600);
        result.put("Ivanov9", 1000);
        result.put("Ivanov10", 1000);

        return result;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> item :
                copy.entrySet()) {
            if(item.getValue() < 500) map.remove(item.getKey());
        }
    }

    public static void main(String[] args) {

    }
}