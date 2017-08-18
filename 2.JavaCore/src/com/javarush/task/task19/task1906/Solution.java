package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        //1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String inFileName = cReader.readLine();
        String outFileName = cReader.readLine();

        //2. BufferedReader для считывания данных с консоли должен быть закрыт.
        cReader.close();

        //3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
        //5. Программа должна записывать во второй файл все байты из первого файла с четным индексом (используй FileWriter).
        FileReader inFile = new FileReader(inFileName);
        FileWriter outFile = new FileWriter(outFileName);
        boolean even = false;
        while (inFile.ready()) {
            if(even){
                outFile.write(inFile.read());
                even = false;
            } else {
                inFile.read();
                even = true;
            }
        }

        //4. Поток чтения из файла (FileReader) должен быть закрыт.
        //6. Поток записи в файл (FileWriter) должен быть закрыт.
        inFile.close();
        outFile.close();
    }
}
