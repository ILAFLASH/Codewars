package com.codewars.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class Task3 {
    /*  Given a string of words, you need to find the highest scoring word.
        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
        You need to return the highest scoring word as a string.
        If two words score the same, return the word that appears earliest in the original string.
        All letters will be lowercase and all inputs will be valid.
    */
    public static String high(String s) {
        boolean bool = true;
        String substr = s;
        String word;
        String highScoreWord;
        int sum;
        int biggestSum;

        highScoreWord = "";
        biggestSum = 0;

        // Вырезаем слова
        while (bool) {
            if (substr.indexOf(' ') != -1) {
                word = substr.substring(0, substr.indexOf(" "));
                substr = substr.substring(substr.indexOf(" ") + 1);
                sum = 0;
                //Нахождение суммы
                for (int i = 0; i < word.length(); i++) {
                    sum += (Character.getNumericValue(word.charAt(i)) - 9);
                }
                if (sum > biggestSum) {
                    biggestSum = sum;
                    highScoreWord = word;
                }

            } else {
                word = substr;
                sum = 0;
                //Нахождение суммы
                for (int i = 0; i < word.length(); i++) {
                    sum += (Character.getNumericValue(word.charAt(i)) - 9);
                }
                if (sum > biggestSum) {
                    biggestSum = sum;
                    highScoreWord = word;
                }
                bool = false;
            }
        }
        return highScoreWord;
    }

    /*
    Решение этой же задачи

    public static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }*/

    public static void main(String[] args) {
        System.out.println(high("abcds mnvm xzzxx poi hfgd xyz"));
    }

}
