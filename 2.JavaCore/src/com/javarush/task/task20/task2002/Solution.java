package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    static SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("your_file_name", null);
            File your_file_name = new File("your_file_name");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("A");
            user1.setLastName("Z");
            user1.setBirthDate(dataFormat.parse("19830707"));
            user1.setMale(true);
            user1.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user1);
            User user2 = new User();
            user2.setFirstName("B");
            user2.setLastName("Y");
            user2.setBirthDate(dataFormat.parse("20010911"));
            user2.setMale(false);
            user2.setCountry(User.Country.OTHER);
            javaRush.users.add(user2);
            User user3 = new User();
            user3.setFirstName("C");
            user3.setLastName("Z");
            user3.setBirthDate(dataFormat.parse("19550131"));
            user3.setMale(true);
            user3.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user3);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (int i = 0; i < javaRush.users.size(); i++){
                System.out.println(
                        javaRush.users.get(i).equals(loadedObject.users.get(i))
                );
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);

            for (User item :
                    users) {
                pw.println(item.getFirstName());
                pw.println(item.getLastName());
                pw.println(item.getBirthDate().getTime());
                pw.println(item.isMale());
                pw.println(item.getCountry());
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            while (br.ready()){
                User item = new User();
                item.setFirstName(br.readLine());
                item.setLastName(br.readLine());
                item.setBirthDate(new Date(Long.parseLong(br.readLine())));
                item.setMale(Boolean.parseBoolean(br.readLine()));
                switch (br.readLine()) {
                    case "UKRAINE" : item.setCountry(User.Country.UKRAINE);
                        break;
                    case "RUSSIA" : item.setCountry(User.Country.RUSSIA);
                        break;
                    case "OTHER" : item.setCountry(User.Country.OTHER);
                        break;
                }
                users.add(item);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
