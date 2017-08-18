package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    final private static int KEY = 5;
    public static void main(String[] args) throws IOException {
        //1. Считывать с консоли ничего не нужно.
        //2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
        FileReader fileReader = new FileReader(args[1]);

        //3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
        FileWriter fileWriter = new FileWriter(args[2]);

        //4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
        if(args[0].equals("-e")) {
            while(fileReader.ready()) fileWriter.write(fileReader.read() + KEY);
        }

        //5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
        if(args[0].equals("-d")) {
            while(fileReader.ready()) fileWriter.write(fileReader.read() - KEY);
        }

        //6. Созданные для файлов потоки должны быть закрыты.
        fileReader.close();
        fileWriter.close();
    }

}
