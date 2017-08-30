package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> result = new HashMap<>();

        result.put("Ivanov", "Ivan");
        result.put("Ivanishenko", "Kolya");
        result.put("Ivanova", "Olya");
        result.put("Petrov", "Ivan");
        result.put("Petrovkin", "Piter");
        result.put("Zubatka", "Gresha");
        result.put("Petrova", "Katya");
        result.put("Sidorov", "Andrey");
        result.put("Kruzeshtern", "Olya");
        result.put("Shvonder", "Nikodim");

        return result;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int result = 0;
        for (Map.Entry<String, String> item :
                map.entrySet()) {
            if(item.getValue().equals(name)) result++;
        }

        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int result = 0;
        for (Map.Entry<String, String> item :
                map.entrySet()) {
            if(item.getKey().equals(lastName)) result++;
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
