package com.javarush.task.task19.task1905;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    //1. Класс Solution должен содержать public static поле countries типа Map.
    public static Map<String,String> countries = new HashMap<String,String>();

    //2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
/*
        DataAdapter dataAdapter = new DataAdapter(new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName() {
                return "Ukraine";
            }
        }, new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return "+38(050)123-45-67";
            }
        });
        System.out.println(dataAdapter.getCountryCode());
        System.out.println(dataAdapter.getCompany());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());
        System.out.println(dataAdapter.getDialString());
*/
    }

    //6. Класс DataAdapter должен реализовывать интерфейс RowItem.
    public static class DataAdapter implements RowItem{
        //7. Класс DataAdapter должен содержать два приватных поля: customer типа Customer и contact Contact.
        private Customer customer;
        private Contact contact;

        //8. Класс DataAdapter должен содержать конструктор с параметрами (Customer customer, Contact contact), который инициализирует поля contact и customer.
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        //9. В классе DataAdapter реализуй методы интерфейса RowItem используя подсказки в виде комментариев в интерфейсах.
        @Override
        public String getCountryCode() {
            String countryIndex = null;
            for (Map.Entry<String, String> item :
                    countries.entrySet()) {
                if (item.getValue().equals(customer.getCountryName())) countryIndex = item.getKey();
            }
            return countryIndex;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
            return "callto://" + contact.getPhoneNumber().replaceAll("[^+0-9]","");
        }
    }

    //3. Класс Solution должен содержать интерфейс RowItem.
    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    //5. Класс Solution должен содержать интерфейс Customer.
    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    //4. Класс Solution должен содержать интерфейс Contact.
    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}