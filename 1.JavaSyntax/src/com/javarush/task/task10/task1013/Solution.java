package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private String middleName;
        private int age;
        private boolean sex;
        private String address;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String surname){
            this(name);
            this.surname = surname;
        }

        public Human(String name, String surname, boolean sex){
            this(name, surname);
            this.sex = sex;
        }

        public Human(String name, String surname, boolean sex, int age){
            this(name, surname, sex);
            this.age = age;
        }

        public Human(String name, String surname, String middleName, boolean sex, int age){
            this(name, surname, sex, age);
            this.middleName = middleName;
        }

        public Human(String name, String surname, String middleName, boolean sex, int age, String address){
            this(name, surname, middleName, sex, age);
            this.address = address;
        }

        public Human(String name, String surname, boolean sex, int age, String address){
            this(name, surname, sex, age);
            this.address = address;
        }

        public Human(String name, String surname, boolean sex, String address){
            this(name, surname, sex);
            this.address = address;
        }

        public Human(String name, String surname, String middleName,boolean sex, String address){
            this(name, surname, sex, address);
            this.middleName = middleName;
        }

        public Human(String name, boolean sex, int age){
            this(name);
            this.sex = sex;
            this.age = age;
        }
    }
}
