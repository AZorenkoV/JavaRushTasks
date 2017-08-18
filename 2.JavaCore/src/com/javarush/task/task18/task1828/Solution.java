package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        //1. Программа должна считать имя файла для операций CrUD с консоли.
        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReader.readLine();
        cReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        List<String> fileBody = new ArrayList<>();
        while(fileReader.ready()) fileBody.add(fileReader.readLine());
        fileReader.close();

        //2. При запуске программы без параметров список товаров должен остаться неизменным.
        //3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
        //4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
        //5. Созданные для файлов потоки должны быть закрыты.
        if((args.length != 0) && (args[0].equals("-u") || args[0].equals("-d"))) {

            char [] id = new char[8];
            for (int i = 0; i < id.length; i++) {
                if(i < args[1].toCharArray().length) {
                    id[i] = args[1].toCharArray()[i];
                } else {
                    id[i] = ' ';
                }
            }
            String idString = new String(id);

            if(args[0].equals("-u")){
                char [] productName = new char[30];
                char [] price = new char[8];
                char [] quantity = new char[4];
                for (int i = 0; i < productName.length; i++) {
                    if(i < args[2].toCharArray().length) {
                        productName[i] = args[2].toCharArray()[i];
                    } else {
                        productName[i] = ' ';
                    }
                }
                for (int i = 0; i < price.length; i++) {
                    if(i < args[3].toCharArray().length) {
                        price[i] = args[3].toCharArray()[i];
                    } else {
                        price[i] = ' ';
                    }
                }
                for (int i = 0; i < quantity.length; i++) {
                    if(i < args[4].toCharArray().length) {
                        quantity[i] = args[4].toCharArray()[i];
                    } else {
                        quantity[i] = ' ';
                    }
                }

                for (String item :
                        fileBody) {
                    if(item.substring(0, 8).equals(idString)) {
                        fileBody.set(fileBody.indexOf(item), idString + new String(productName) + new String(price) + new String(quantity));
                        break;
                    }
                }
            } else if(args[0].equals("-d")) {
                for (String item :
                        fileBody) {
                    if(item.substring(0, 8).equals(idString)) {
                        fileBody.remove(item);
                        break;
                    }
                }
            }

            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (String iten :
                    fileBody) {
                writer.println(iten);
            }
            writer.close();
        }
    }
}
