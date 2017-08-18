package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{89, 47, 1, 29, 35});
        result.add(new int[]{15, 94});
        result.add(new int[]{43, 27, 6, 74});
        result.add(new int[]{12, 36, 88, 7, 48, 51, 60});
        result.add(new int[]{});
        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
