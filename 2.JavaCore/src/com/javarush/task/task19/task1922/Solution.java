package com.javarush.task.task19.task1922;

import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
4. BufferedReader для считывания данных с консоли должен быть закрыт.
5. Программа должна считывать содержимое файла (используй FileReader).
6. Поток чтения из файла (FileReader) должен быть закрыт.
7. Программа должна выводить в консоль все строки из файла, которые содержат всего 2 слова из списка words.
*/

public class Solution {
    //1. Класс Solution должен содержать публичное статическое поле words типа List, которое должно быть сразу проинициализировано.
    public static List<String> words = new ArrayList<String>();

    //2. Класс Solution должен содержать статический блок, в котором добавляются три слова в список words.
    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        //3. Программа должна считывать имя файла с консоли (используй BufferedReader).


    }
}
