package com.codewars.kyu7;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(print(0));
        System.out.println(print(2));
        System.out.println(print(1));
        System.out.println(print(3));
        System.out.println(print(5));
        System.out.println(print(7));
        System.out.println(print(9));
    }

    public static String print(int n) {
        String result = "";
        if (n % 2 == 0 || n < 0) {
            return null;
        } else {
            for (int i = 1; i <= (n / 2 + 1); i++) {
                for (int j = (n - (i * 2 - 1)) / 2; j >= 1; j--) {
                    result += " ";
                }
                for (int k = 1; k <= (i * 2 - 1); k++) {
                    result += "*";
                }
                result += "\n";
            }

            for (int i = n / 2; i >= 1; i--) {
                for (int j = (n - (i * 2 - 1)) / 2; j >= 1; j--) {
                    result += " ";
                }
                for (int k = 1; k <= (i * 2 - 1); k++) {
                    result += "*";
                }
                result += "\n";
            }
            return result;
        }
    }
}
