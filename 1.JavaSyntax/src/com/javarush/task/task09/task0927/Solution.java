package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> result = new HashMap<>();
        result.put("Cat1", new Cat("Cat1"));
        result.put("Cat2", new Cat("Cat2"));
        result.put("Cat3", new Cat("Cat3"));
        result.put("Cat4", new Cat("Cat4"));
        result.put("Cat5", new Cat("Cat5"));
        result.put("Cat6", new Cat("Cat6"));
        result.put("Cat7", new Cat("Cat7"));
        result.put("Cat8", new Cat("Cat8"));
        result.put("Cat9", new Cat("Cat9"));
        result.put("Cat10", new Cat("Cat10"));
        return result;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> result = new HashSet<>();
        for (Map.Entry<String, Cat> item :
                map.entrySet()) {
            result.add(item.getValue());
        }
        return result;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
