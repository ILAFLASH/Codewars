/*An isogram is a word that has no repeating letters, consecutive or non-consecutive.
        Implement a function that determines whether a string that contains only letters is an isogram.
        Assume the empty string is an isogram. Ignore letter case.

        isIsogram "Dermatoglyphics" == true
        isIsogram "aba" == false
        isIsogram "moOse" == false -- ignore letter case*/

package com.codewars.kyu6;

public class Isogram {
    public static boolean isIsogram(String str) {
        if (str.length() != 0) {
            char[] letters = str.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                for (int j = i + 1; j < letters.length; j++) {
                    if (Character.toLowerCase(letters[i]) == Character.toLowerCase(letters[j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isIsogram("Dermatoglyphics");
        isIsogram("aba");
        isIsogram("moOse");
    }
}

/*public class isogram {
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}*/
