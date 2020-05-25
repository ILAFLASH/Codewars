package com.codewars.kyu7;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("A"));
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 != 0) {
            return Character.toString(word.charAt(word.length() / 2));
        } else {
            return Character.toString(word.charAt(word.length() / 2 - 1)) + word.charAt(word.length() / 2);
        }

        /*public static String getMiddle(String word) {
            int length = word.length();
            return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
        }*/

    }
}
