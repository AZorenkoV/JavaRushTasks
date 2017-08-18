package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //1. Программа должна считать имя файла с консоли.
        BufferedReader cReade = new BufferedReader(new InputStreamReader(System.in));
        String fileName = cReade.readLine();
        cReade.close();

        //2. Создай для файла поток для чтения.
        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));

        //3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
        while (fileBufferedReader.ready()){
            String [] item = fileBufferedReader.readLine().split(" ");
            if(item[0].equals(args[0])) {
                int id = Integer.parseInt(item[0]);
                String productName = item[1];
                if(item.length > 4)
                    for (int i = 2; i < item.length-2; i++)
                        productName = productName + " " + item[i];
                double price = Double.parseDouble(item[item.length-2]);
                int quantity = Integer.parseInt(item[item.length-1]);
                System.out.println(id + " " + productName + " " + price + " " + quantity);
            }
        }

        //4. Поток для чтения из файла должен быть закрыт.
        fileBufferedReader.close();
    }
}
