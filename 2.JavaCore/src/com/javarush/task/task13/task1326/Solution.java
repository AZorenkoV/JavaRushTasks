package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        InputStream fi = new FileInputStream(fileName);
        br = new BufferedReader(new InputStreamReader(fi));
        ArrayList<Integer> numbers = new ArrayList<>();

        while(br.ready()) {
            Integer number = Integer.parseInt(br.readLine());
            if (number%2 == 0) numbers.add(number);
        }


        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j - 1));
                    numbers.set(j - 1, temp);
                }
            }
        }

        for (Integer item :
                numbers) {
            System.out.println(item);
        }

        fi.close();
        br.close();
    }
}
