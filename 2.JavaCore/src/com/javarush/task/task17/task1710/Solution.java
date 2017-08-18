package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                create(args);
                break;
            case "-u":
                update(args);
                break;
            case "-d":
                delete(args);
                break;
            case "-i":
                info(args);
        }
    }

    public static void create(String[] args) {
        try {
            Date bd = (new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)).parse(args[3]);
            if(args[2].equals("м")) allPeople.add(Person.createMale(args[1], bd));
            else allPeople.add(Person.createFemale(args[1], bd));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(allPeople.size()-1);
    }


    public static void update(String[] args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));

        person.setName(args[2]);
        person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
        try {
            person.setBirthDay((new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)).parse(args[4]));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void delete(String[] args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));

        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);
    }


    public static void info(String[] args) {
        Person person = allPeople.get(Integer.parseInt(args[1]));

        System.out.println(person.getName() + " " + (person.getSex().equals(Sex.MALE) ? "м" : "ж") + " " + (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH)).format(person.getBirthDay()));
    }
}
