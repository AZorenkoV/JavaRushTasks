package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static boolean isRun = true;
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        Thread t = new Thread(tt);
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isRun = false;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (isRun) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
