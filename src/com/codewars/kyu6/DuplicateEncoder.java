/*The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that
        character appears only once in the original string, or ")" if that character appears more than once in the
        original string. Ignore capitalization when determining if a character is a duplicate.

        Examples
        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
        Notes

        Assertion messages may be unclear about what they display in some languages.
        If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!*/

package com.codewars.kyu6;

public class DuplicateEncoder {
    public static String encode(String word) {
        char[] lettersIn = word.toLowerCase().toCharArray();
        char[] lettersOut = new char[lettersIn.length];
        for (int i = 0; i < lettersIn.length; i++) {
            for (int j = i + 1; j < lettersIn.length; j++) {
                if (lettersIn[i] == lettersIn[j] && lettersOut[j] == '\u0000') {
                    lettersOut[i] = ')';
                    lettersOut[j] = ')';
                }
            }
            if (lettersOut[i] == '\u0000') {
                lettersOut[i] = '(';
            }
        }
        return String.valueOf(lettersOut);
    }

    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));
    }
}
