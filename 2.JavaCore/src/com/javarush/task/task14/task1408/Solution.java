package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    public static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (Country.BELARUS.equals(country)) hen = new BelarusianHen();
            if (Country.MOLDOVA.equals(country)) hen = new MoldovanHen();
            if (Country.RUSSIA.equals(country)) hen = new RussianHen();
            if (Country.UKRAINE.equals(country)) hen = new UkrainianHen();
            return hen;
        }
    }
}
