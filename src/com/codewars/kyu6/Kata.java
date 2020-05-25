/*Acknowledgments:
        I thank yvonne-liu for the idea and for the example tests :)

        Description:
        Encrypt this!

        You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

        Your message is a string containing space separated words.
        You need to encrypt each word in the message using the following rules:
        The first letter needs to be converted to its ASCII code.
        The second letter needs to be switched with the last letter
        Keepin' it simple: There are no special characters in input.
        Examples:
        Kata.encryptThis("Hello") => "72olle"
        Kata.encryptThis("good") => "103doo"
        Kata.encryptThis("hello world") => "104olle 119drlo"*/

package com.codewars.kyu6;

public class Kata {
    public static String encryptThis(String text) {
        if (text != "") {
            String[] words = text.split(" ");
            StringBuilder resultstring = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                char[] chars = words[i].toCharArray();
                resultstring.append((int) chars[0]);
                if (chars.length > 1) {
                    resultstring.append(chars[chars.length - 1]);
                    for (int j = 2; j < chars.length - 1; j++) {
                        resultstring.append(chars[j]);
                    }
                    if (chars.length > 2) {
                        resultstring.append(chars[1]);
                    }
                }
                resultstring.append(" ");
            }
            resultstring.deleteCharAt(resultstring.length()-1);
            System.out.println(resultstring);
            return resultstring.toString();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
       /* encryptThis("");
        encryptThis("Hello");
        encryptThis("good");
        encryptThis("hello world");*/
        encryptThis("A wise old owl lived in an oak");
    }
}

/*
public class Kata {
    public static String encryptThis(String text) {
        return Arrays.stream(text.split(" "))
                .map(w->w.length()>2?(int)w.charAt(0)+w.substring(w.length()-1)+w.substring(2, w.length()-1)+w.substring(1,2):
                        w.length()>1?(int)w.charAt(0)+w.substring(1):
                                w.length()==1?(int)w.charAt(0)+"":"")
                .collect(Collectors.joining(" "));
    }
}*/
