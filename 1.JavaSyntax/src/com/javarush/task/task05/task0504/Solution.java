package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Solution.Cat cat1 = new Solution.Cat("Vaske", 2, 4, 10);
        Solution.Cat cat2 = new Solution.Cat("Murka", 3, 3, 5);
        Solution.Cat cat3 = new Solution.Cat("Barsik", 1, 3, 9);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}