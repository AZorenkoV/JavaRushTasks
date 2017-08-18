package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            float[] i = new float[0];
            System.out.println(i[1]);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.out.println("".charAt(1));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer i = Integer.parseInt("s");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream i = new FileInputStream("vvv.vvv");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = new String();
            Integer i = (Integer) o;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] i = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException("NullPointerException");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new UnsupportedOperationException("Invalid operation for sorted list.");
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
