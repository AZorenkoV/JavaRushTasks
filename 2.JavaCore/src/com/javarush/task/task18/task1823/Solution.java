package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        //1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while(!(fileName = cReader.readLine()).equals("exit")){
            //2. Для каждого файла создай нить ReadThread и запусти ее.
            new ReadThread(fileName).start();
        }
        /*
        for (Map.Entry<String, Integer> item : resultMap.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        };
        */
        cReader.close();
    }

    public static class ReadThread extends Thread {

        private String fileName;

        public ReadThread(String fileName){
            //implement constructor body
            //3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            //4. Затем, нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
            int [] bytes = new int[128];
            try(FileReader fileReader = new FileReader(this.fileName)) {
                while (fileReader.ready()){
                    bytes[fileReader.read()]++;
                }
                int maxByte = 0;
                int maxCount = bytes[0];
                for (int i = 0; i < bytes.length; i++) {
                    if(maxCount < bytes[i]) {
                        maxByte = i;
                        maxCount = bytes[i];
                    }
                }
                resultMap.put(this.fileName, maxByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
