package com.javarush.task.task14.task1408;

/**
 * Created by zorenkoav on 16.05.2017.
 */
public class BelarusianHen extends Hen {
    final int COUNTOFEGGS = 50;
    final String COUNTRY = Country.BELARUS;

    @Override
    public int getCountOfEggsPerMonth() {
        return COUNTOFEGGS;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + COUNTRY + ". Я несу " + COUNTOFEGGS + " яиц в месяц.";
    }
}
