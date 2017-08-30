package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна два раза считать имена файлов с консоли.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = cReader.readLine();
        String fileName2 = cReader.readLine();
        cReader.close();

        //2. Для первого файла создай поток для чтения и считай его содержимое.
        FileReader firstFileReader = new FileReader(fileName1);
        StringBuilder file1 = new StringBuilder();
        while (firstFileReader.ready()) file1.append((char)firstFileReader.read());
        firstFileReader.close();

        //3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
        FileWriter firstFileWrite = new FileWriter(fileName1);
        FileReader secondFileReader = new FileReader(fileName2);

        //4. Содержимое первого и второго файла нужно объединить в первом файле.
        //5. Сначала должно идти содержимое второго файла, затем содержимое первого.
        while (secondFileReader.ready()) firstFileWrite.write(secondFileReader.read());
        firstFileWrite.write(file1.toString());

        //6. Созданные для файлов потоки должны быть закрыты.
        firstFileWrite.close();
        secondFileReader.close();

    }
}
