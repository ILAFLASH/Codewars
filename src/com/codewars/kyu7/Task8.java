package com.codewars.kyu7;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        Vowels.getCount("sfksadfsfcbbkiou");
        Vowels.getCount("aaa aaa aaa");
        Vowels.getCount("     ");
    }
}

class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        List<Character> inputList = new ArrayList<>();
        List<Character> vowelsList = new ArrayList<>();
        vowelsList.add('a');
        vowelsList.add('i');
        vowelsList.add('o');
        vowelsList.add('e');
        vowelsList.add('u');
        for (int i = 0; i < str.length(); i++) {
            inputList.add(str.charAt(i));
        }
        for (int i = 0; i < inputList.size() ; i++) {
            for (int j = 0; j < vowelsList.size(); j++) {
                if (inputList.get(i) == vowelsList.get(j)) {
                    vowelsCount++;
                    break;
                }
            }
        }
        System.out.println(inputList);
        System.out.println(vowelsList);
        System.out.println(vowelsCount);
        return vowelsCount;
    }

}

/*
public class Vowels {

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}*/
