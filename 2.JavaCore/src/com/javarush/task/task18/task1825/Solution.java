package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> filesList = new LinkedList<>();
        String buff;
        while(!(buff = cReader.readLine()).equals("end")) filesList.add(buff);

        //2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
        String fileName = filesList.get(0).substring(0,filesList.get(0).indexOf(".part"));
        FileWriter fileWriter = new FileWriter(fileName);

        //3. В новый файл перепиши все байты из файлов-частей *.partN.
        //4. Чтение и запись должны происходить с использованием буфера.
        //5. Созданные для файлов потоки должны быть закрыты.
        BufferedWriter bw = new BufferedWriter(fileWriter);
        BufferedReader br;
        for (int i = 0; i < filesList.size(); i++) {
            br = new BufferedReader(new FileReader(fileName + ".part" + (i+1)));
            while (br.ready()) bw.write(br.read());
            br.close();
            bw.flush();
        }
        bw.close();
    }
}
