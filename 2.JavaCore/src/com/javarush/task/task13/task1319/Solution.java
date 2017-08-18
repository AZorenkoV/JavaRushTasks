package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        while(true) {
            String line = br.readLine();
            if(line.equals("exit")){
                bw.write(line);
                bw.newLine();
                break;
            }
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
