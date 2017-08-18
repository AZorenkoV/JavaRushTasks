package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //1. Программа должна считать имя файла для операций CrUD с консоли.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        //2. При запуске программы без параметров список товаров должен остаться неизменным.
        //3. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
        if((args.length != 0) && args[0].equals("-c")) {
            //4. Товар должен иметь следующий id, после максимального, найденного в файле.
            //5. Форматирование новой строки товара должно четко совпадать с указанным в задании.
            //6. Созданные для файлов потоки должны быть закрыты.
            char [] productName = new char[30];
            char [] price = new char[8];
            char [] quantity = new char[4];
            char [] id = new char[8];
            for (int i = 0; i < productName.length; i++) {
                if(i < args[1].toCharArray().length) {
                    productName[i] = args[1].toCharArray()[i];
                } else {
                    productName[i] = ' ';
                }
            }
            for (int i = 0; i < price.length; i++) {
                if(i < args[2].toCharArray().length) {
                    price[i] = args[2].toCharArray()[i];
                } else {
                    price[i] = ' ';
                }
            }
            for (int i = 0; i < quantity.length; i++) {
                if(i < args[3].toCharArray().length) {
                    quantity[i] = args[3].toCharArray()[i];
                } else {
                    quantity[i] = ' ';
                }
            }

            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            int lastId = 0;
            int maxId = 0;
            List<String> fileBody = new ArrayList<>();
            while(fileReader.ready()){
                String buffer = fileReader.readLine();
                fileBody.add(buffer);
                lastId = Integer.parseInt(buffer.substring(0,8).trim());
                if (lastId > maxId) maxId = lastId;
            }
            fileReader.close();

            char [] lastIdCharArr = new Integer(++maxId).toString().toCharArray();
            for (int i = 0; i < id.length; i++) {
                if(i < lastIdCharArr.length) {
                    id[i] = lastIdCharArr[i];
                } else {
                    id[i] = ' ';
                }
            }

            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (String iten :
                    fileBody) {
                writer.println(iten);
            }
            writer.println(new String(id) + new String(productName) + new String(price) + new String(quantity));
            writer.close();
            /*
            fileWriter.write(id);
            fileWriter.write(productName);
            fileWriter.write(price);
            fileWriter.write(quantity);
            fileWriter.write(new char[]{'\r','\n'});

            fileWriter.close();
            */
        }
        cReader.close();
    }
}
