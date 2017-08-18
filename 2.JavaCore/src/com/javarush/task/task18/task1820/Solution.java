package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна два раза считать имена файлов с консоли.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = cReader.readLine();
        String secondFileName = cReader.readLine();
        cReader.close();

        //2. Для первого файла создай поток для чтения. Для второго - поток для записи.
        FileReader firstFile = new FileReader(firstFileName);
        FileWriter seconfFile = new FileWriter(secondFileName);

        //3. Считать числа из первого файла, округлить их и записать через пробел во второй.
        StringBuilder number = new StringBuilder();
        while(firstFile.ready())
        {
            char symbol = (char)firstFile.read();
            if(symbol == ' ') {
                System.out.println();
                seconfFile.write((new Long(Math.round(Double.valueOf(number.toString())))).toString() + " ");
                number = new StringBuilder();
            } else {
                number.append(symbol);
            }

        }
        seconfFile.write((new Long(Math.round(Double.valueOf(number.toString())))).toString() + " ");

        //4. Должны соблюдаться принципы округления, указанные в задании.
        //5. Созданные для файлов потоки должны быть закрыты.
        firstFile.close();
        seconfFile.close();
    }
}
