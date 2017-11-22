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

            while(fReader.ready()){
                sb.append((char)fReader.read());
            }
            String newline = sb.toString().replaceAll( System.lineSeparator(), "");


            while (newline.indexOf("<span") != -1){
                String temp = newline.substring(newline.indexOf(openTag));
                int nextOpenTag = temp.substring(openTag.length()).indexOf(openTag);
                int nextCloseTeg = temp.indexOf(closeTag);

                System.out.println(nextOpenTag + " " + nextCloseTeg);

                if((nextOpenTag > nextCloseTeg) || (nextOpenTag == -1))
                    tags.add(temp.substring(0 , temp.indexOf(closeTag)+closeTag.length()));
                else
                {
                    while (temp.lastIndexOf(openTag) )
                }
                newline = newline.substring(newline.indexOf(openTag)+openTag.length());
            }

            for (String item :
                    tags) {
                System.out.println(item);

            }

        }
    }
}

