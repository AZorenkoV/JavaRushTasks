package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(16);
        set.add(78);
        set.add(3);
        set.add(54);
        set.add(0);
        set.add(12);
        set.add(8);
        set.add(4);
        set.add(93);
        set.add(59);
        set.add(7);
        set.add(26);
        set.add(17);
        set.add(2);
        set.add(77);
        set.add(6);
        set.add(10);
        set.add(37);
        set.add(48);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iter = set.iterator();

        while ( iter.hasNext()) {
            Integer item = iter.next();
            if ( item > 10) iter.remove();
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
