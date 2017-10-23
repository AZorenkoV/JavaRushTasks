package com.javarush.task.task19.task1922;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
>>>>>>> origin/master
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
<<<<<<< HEAD
4. BufferedReader для считывания данных с консоли должен быть закрыт.
5. Программа должна считывать содержимое файла (используй FileReader).
6. Поток чтения из файла (FileReader) должен быть закрыт.
7. Программа должна выводить в консоль все строки из файла, которые содержат всего 2 слова из списка words.
*/

=======
*/


>>>>>>> origin/master
public class Solution {
    //1. Класс Solution должен содержать публичное статическое поле words типа List, которое должно быть сразу проинициализировано.
    public static List<String> words = new ArrayList<String>();

    //2. Класс Solution должен содержать статический блок, в котором добавляются три слова в список words.
    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

<<<<<<< HEAD
    public static void main(String[] args) {
        //3. Программа должна считывать имя файла с консоли (используй BufferedReader).


=======
    public static void main(String[] args) throws IOException {
        //3. Программа должна считывать имя файла с консоли (используй BufferedReader).
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        //4. BufferedReader для считывания данных с консоли должен быть закрыт.
        cReader.close();

        //5. Программа должна считывать содержимое файла (используй FileReader).
        //6. Поток чтения из файла (FileReader) должен быть закрыт.
        try(FileReader file = new FileReader(fileName)) {
            BufferedReader fileReader = new BufferedReader(file);
            while (fileReader.ready()){
                String string = fileReader.readLine();
                int contain = 0;
                for (int i = 0, size = words.size(); i < size; i++) {
                    if(string.contains(words.get(i))) contain++;
                }
                if(contain == 2) System.out.println(string);
            }
            fileReader.close();
        }
>>>>>>> origin/master
    }
}
