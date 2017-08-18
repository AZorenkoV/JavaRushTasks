package com.javarush.task.task10.task1019;



import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();


        String sId = reader.readLine();
        while(!sId.isEmpty()) {
            Integer id = Integer.parseInt(sId);
            String name = reader.readLine();
            map.put(name, id);
            sId = reader.readLine();
        }

        for (Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getValue() + " " + item.getKey());
        }
    }
}
