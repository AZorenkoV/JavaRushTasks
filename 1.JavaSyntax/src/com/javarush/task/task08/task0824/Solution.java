package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfatherFather = new Human("Nikodim", true, 95);
        Human grandmotherFather = new Human("Fima", false, 85);
        Human grandfatherMother = new Human("Afanasiy", true, 92);
        Human grandmotherMother = new Human("Evdotya", false, 87);
        Human father = new Human("Piter", true, 50, grandmotherFather, grandfatherFather);
        Human mother = new Human("Klara", false, 41, grandmotherMother, grandfatherMother);
        Human son = new Human("Kolya", true, 30, mother, father);
        Human daughter = new Human("Olya", false, 21, mother, father);
        Human junior = new Human("Vasya", true, 15, mother, father);

        System.out.println(grandfatherFather);
        System.out.println(grandmotherFather);
        System.out.println(grandfatherMother);
        System.out.println(grandmotherMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
        System.out.println(junior);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human mother, Human father){
            this(name, sex, age);
            mother.children.add(this);
            father.children.add(this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
