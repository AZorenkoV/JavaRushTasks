package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            FileInputStream file = new FileInputStream(fileName);
            if(file.available() < 1000) {
                file.close();
                throw new DownloadException();
            }
            file.close();
        }
    }

    public static class DownloadException extends Exception {

    }
}
