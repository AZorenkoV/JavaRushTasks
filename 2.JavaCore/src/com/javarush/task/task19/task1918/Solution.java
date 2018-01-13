package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами

5. Программа должна выводить в консоль все теги, которые соответствуют тегу, заданному в параметре метода main.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна считывать имя файла с консоли (используй BufferedReader).
        //2. BufferedReader для считывания данных с консоли должен быть закрыт.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        cReader.close();

        String openTag = "<" + args[0];
        String closeTag = "</" + args[0] + ">";

        //3. Программа должна считывать содержимое файла (используй FileReader).
        //4. Поток чтения из файла (FileReader) должен быть закрыт.
        try(FileReader fReader = new FileReader(fileName)) {
            StringBuilder sb = new StringBuilder();

            ArrayList<String> tags = new ArrayList<>();

            //считування вмісту файла
            while(fReader.ready()){
                sb.append((char)fReader.read());
            }
            String newline = sb.toString().replaceAll( System.lineSeparator(), "");



            while (newline.indexOf(openTag) != -1){
                int openTagPosition = newline.indexOf(openTag);
                int closeTagPosition = openTagPosition + getEndTagPosition(newline.substring(openTagPosition), openTag, closeTag);

                tags.add(newline.substring(openTagPosition, closeTagPosition + closeTag.length()));
                newline = newline.substring(openTagPosition + openTag.length());
            }


            for (String item :
                    tags) {
                System.out.println(item);

            }

        }
    }

    private static int getEndTagPosition(String line, String openTag, String closeTag) {
        int nextOpenTagPosition = line.substring(1).indexOf(openTag);
        int nextCloseTagPosition = line.indexOf(closeTag);
        //System.out.println("OpenTag " + nextOpenTagPosition + " CloseTag " + nextCloseTagPosition);

        if ((nextOpenTagPosition < nextCloseTagPosition) && (nextOpenTagPosition != -1)) {
            nextCloseTagPosition += (getEndTagPosition(line.substring(nextCloseTagPosition+1), openTag, closeTag) + 1);
        }
        return nextCloseTagPosition;
    }
}

