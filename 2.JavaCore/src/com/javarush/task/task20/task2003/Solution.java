package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        //1. Метод fillInPropertiesMap должен считывать данные с консоли.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //2. Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
        String fileName = bf.readLine();
        FileInputStream fileIn = new FileInputStream(fileName);
        //3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
        load(fileIn);
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        //4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
        Properties p = new Properties();
        for (Map.Entry<String, String> entry :
                properties.entrySet()) {
            p.setProperty(entry.getKey(),entry.getValue());

        }
        p.store(new PrintWriter(outputStream), null);

    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        //5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
        Properties p = new Properties();
        p.load(inputStream);
        properties.putAll((Map)p);
    }

    public static void main(String[] args) {

    }
}
