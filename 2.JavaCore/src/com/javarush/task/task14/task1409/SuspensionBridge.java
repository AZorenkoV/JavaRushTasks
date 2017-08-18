package com.javarush.task.task14.task1409;

/**
 * Created by zorenkoav on 17.05.2017.
 */
public class SuspensionBridge implements Bridge {
    private final static int CAR_COUNT = 200;

    @Override
    public int getCarsCount() {
        return CAR_COUNT;
    }
}
