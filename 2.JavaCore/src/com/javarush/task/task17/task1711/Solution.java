package com.javarush.task.task17.task1711;

import java.text.*;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    info(args);
                }
        }
    }

    public static void create(String[] args) {
        for (int i = 1; i < args.length;) {
            try {
                String name = args[i++];
                Sex sex = args[i++].equals("м") ? Sex.MALE : Sex.FEMALE;
                Date bd = (new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)).parse(args[i++]);
                if (sex.equals(Sex.MALE)) allPeople.add(Person.createMale(name, bd));
                else allPeople.add(Person.createFemale(name, bd));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(allPeople.size() - 1);
        }
    }


    public static void update(String[] args) {
        for (int i = 1; i < args.length; ) {
            Person person = allPeople.get(Integer.parseInt(args[i++]));

            person.setName(args[i++]);
            person.setSex(args[i++].equals("м") ? Sex.MALE : Sex.FEMALE);
            try {
                person.setBirthDay((new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)).parse(args[i++]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void delete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
    }


    public static void info(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            System.out.println(person.getName() + " " + (person.getSex().equals(Sex.MALE) ? "м" : "ж") + " " + (new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH)).format(person.getBirthDay()));
        }
    }
}
