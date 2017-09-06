package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try(FileReader file = new FileReader(args[0])){
            BufferedReader fReader = new BufferedReader(file);
            while(fReader.ready()){
                String [] line = fReader.readLine().split(" ");
                StringBuilder name = new StringBuilder();
                for (int i = 0; i < line.length - 3; i++) {
                    if (i > 0) name.append(" ");
                    name.append(line[i]);
                }
                Date date = new SimpleDateFormat("dd.M.yyyy").parse(line[line.length-3] + "." + line[line.length-2] + "." + line[line.length-1]);
                PEOPLE.add(new Person(name.toString(), date));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
/*
        for (Person item :
                PEOPLE) {
            System.out.println(item.getName() + " - " + item.getBirthday());
        }
*/
    }
}
