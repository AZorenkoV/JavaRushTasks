package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.UK);
        Date date = format.parse(bf.readLine());
        format = new SimpleDateFormat("MMM dd, yyyy", Locale.UK);
        String output = format.format(date);

        //System.out.println(output);
        System.out.println(output.substring(0,output.indexOf(" ")).toUpperCase() + output.substring(output.indexOf(" ")));
    }
}
