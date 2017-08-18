package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
        //2. BufferedReader для считывания данных с консоли должен быть закрыт.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String inFileName = cReader.readLine();
        String outFileName = cReader.readLine();
        cReader.close();

        //3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
        //4. Поток чтения из файла (BufferedReader) должен быть закрыт.
        //5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
        //6. Поток записи в файл (BufferedWriter) должен быть закрыт.
        BufferedReader inFileReader = new BufferedReader(new FileReader(inFileName));
        BufferedWriter outFileWriter = new BufferedWriter(new FileWriter(outFileName));
        while (inFileReader.ready()){
            String line = inFileReader.readLine();
            String [] words = line.split("\\W");
            for (String item: words) outFileWriter.write(item);
        }
        inFileReader.close();
        outFileWriter.close();
    }
}
