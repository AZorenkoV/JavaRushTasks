package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    //3. Класс Solution должен содержать публичное статическое поле lines типа List, которое сразу проинициализировано.
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        //4. В методе main(String[] args) программа должна считывать имена файлов с консоли (используй BufferedReader).
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = cReader.readLine();
        String file2Name = cReader.readLine();

        //5. В методе main(String[] args) BufferedReader для считывания данных с консоли должен быть закрыт.
        cReader.close();

        //6. Программа должна считывать содержимое первого и второго файла (используй FileReader).
        FileReader file1Reader = new FileReader(file1Name);
        FileReader file2Reader = new FileReader(file2Name);
        BufferedReader file1BReader = new BufferedReader(file1Reader);
        BufferedReader file2BReader = new BufferedReader(file2Reader);

        List<String> file1String = new ArrayList<>();
        List<String> file2String = new ArrayList<>();

        while (file1BReader.ready())file1String.add(file1BReader.readLine());
        while (file2BReader.ready())file2String.add(file2BReader.readLine());


        //7. Потоки чтения из файлов (FileReader) должны быть закрыты.
        file1Reader.close();
        file2Reader.close();
        //file1BReader.close();
        //file2BReader.close();

        //System.out.println(file1String.toString());
        //System.out.println(file2String.toString());

        int list1Size = file1String.size();
        int list2Size = file2String.size();
        int i = 0;
        int j = 0;

        //8. Список lines должен содержать объединенную версию строк из файлов, где для каждой строки указана одна из операций ADDED, REMOVED, SAME.
        while((i < list1Size) && (j < list2Size)){
            if(file1String.get(i).equals(file2String.get(j))){
                lines.add(new LineItem(Type.SAME, file1String.get(i++)));
                j++;
            } else {
                if (file1String.get(i).equals(file2String.get(j+1)) && (j+1 < list2Size)) {
                    lines.add(new LineItem(Type.ADDED, file2String.get(j++)));
                } else {
                    lines.add(new LineItem(Type.REMOVED, file1String.get(i++)));
                }
            }
        }

        if(i < list1Size){
            lines.add(new LineItem(Type.REMOVED, file1String.get(i)));
        } else if (j < list2Size) {
            lines.add(new LineItem(Type.ADDED, file2String.get(j)));
        }

        //for (int k = 0; k < lines.size(); k++) System.out.println(lines.get(k).type + " " + lines.get(k).line);

    }

    //2. Класс Solution должен содержать enum Type.
    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    //1. Класс Solution должен содержать класс LineItem.
    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}