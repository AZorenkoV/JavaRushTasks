package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> result = new HashMap<>();

        result.put("Ivanov", "Ivan");
        result.put("Petrov", "Piter");
        result.put("Sidorov", "Sidor");
        result.put("Zayka", "Ivan");
        result.put("Kuzhenshtern", "Vlad");
        result.put("Tetcher", "Margaret");
        result.put("Yellow", "Hoholok");
        result.put("Cruzo", "Robinzon");
        result.put("Friday", "Ivan");
        result.put("Gagarin", "Yuriy");

        return result;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, Integer> name = new HashMap<>();
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (name.put(pair.getValue(), 1) != null) removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
