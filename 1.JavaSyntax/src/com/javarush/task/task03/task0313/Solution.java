package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String word1 = "Мама";
        String word2 = "Мыла";
        String word3 = "Раму";

        System.out.println(word1 + word2 + word3);
        System.out.println(word1 + word3 + word2);
        System.out.println(word2 + word1 + word3);
        System.out.println(word2 + word3 + word1);
        System.out.println(word3 + word2 + word1);
        System.out.println(word3 + word1 + word2);

    }
}
