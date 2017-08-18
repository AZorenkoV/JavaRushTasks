package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> towns = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();

            towns.put(town, family);
        }

        //read home number
        String town = reader.readLine();

        for (Map.Entry<String, String> item :
                towns.entrySet()) {
            if (item.getKey().equals(town)) System.out.println(item.getValue());
        }
    }
}
