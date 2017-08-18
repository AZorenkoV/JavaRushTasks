package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }

    public static void main(String[] args){
    }

    public static class FirstThread extends Thread{
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class SecondThread extends Thread {
        @Override
        public void run() {
            try{
                Thread.sleep(1000000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread {
        @Override
        public void run() {
            try{
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class FourthThread extends Thread implements Message {
        @Override
        public void showWarning() {
            if(isAlive()) interrupt();
        }
    }

    public  static class FifthThread extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                int summ = 0;
                String string = reader.readLine();
                while (!string.equals("N")) {
                    summ += Integer.parseInt(string);
                    string = reader.readLine();
                }
                System.out.println(summ);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}