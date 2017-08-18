package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        //1. Программа должна считывать имена файлов с консоли.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            //2. Для каждого файла нужно создавать поток для чтения.
            String fileName = null;
            try {
                fileName = cReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
            try(FileReader fileReader = new FileReader(fileName)){

            } catch (FileNotFoundException e) {
                //4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
                System.out.println(fileName);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //5. Потоки для чтения из файла должны быть закрыты.
        //6. Команду "System.exit();" использовать нельзя.
    }
}
