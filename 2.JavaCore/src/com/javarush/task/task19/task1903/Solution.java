package com.javarush.task.task19.task1903;

/*
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //1. Класс Solution должен содержать public static поле countries типа Map.
    public static Map<String, String> countries = new HashMap<String, String>();

    //2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }


    public static void main(String[] args) {
        /*String phoneNomber = new Integer(501234567).toString();
        System.out.println("+" + 38 + "(0" + phoneNomber.substring(0,2) + ")"
                + phoneNomber.substring(2,5) + "-" + phoneNomber.substring(5,7) + "-"
                + phoneNomber.substring(7));*/

        /*IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "UA";
            }

            @Override
            public String getCompany() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "Ivan";
            }

            @Override
            public String getContactLastName() {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 501234567;
            }
        };
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);
        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getPhoneNumber());*/
    }

    //3. Класс IncomeDataAdapter должен реализовывать интерфейсы Customer и Contact.
    public static class IncomeDataAdapter implements Solution.Customer, Solution.Contact {

        //4. Класс IncomeDataAdapter должен содержать приватное поле data типа IncomeData.
        private IncomeData data;

        //5. Класс IncomeDataAdapter должен содержать конструктор с параметром IncomeData.
        IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        //6. В классе IncomeDataAdapter реализуй методы интерфейсов Customer и Contact используя подсказки в виде комментариев в интерфейсах.
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String s = "" + data.getPhoneNumber();
            while (s.length() < 10) { s = 0 + s; }
            return String.format( "+%d(%s)%s-%s-%s", data.getCountryPhoneCode(), s.substring(0, 3), s.substring(3, 6), s.substring(6, 8), s.substring(8, 10) );
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}