package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameFirst = reader.readLine();
        String fileNameSecond = reader.readLine();
        reader = new BufferedReader(new FileReader(fileNameFirst));
        while (reader.ready()){
            allLines.add(reader.readLine());
        }
        reader = new BufferedReader(new FileReader(fileNameSecond));
        while (reader.ready()){
            forRemoveLines.add(reader.readLine());
        }
        (new Solution()).joinData();
    }

    public void joinData () throws CorruptedDataException {
        List<String> result = allLines.subList(0, allLines.size());

        for (int i = 0; i < forRemoveLines.size(); i++) {
            if(result.contains(forRemoveLines.get(i))) result.remove(forRemoveLines.get(i));
            else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }

        allLines = result.subList(0, result.size());
    }
}
