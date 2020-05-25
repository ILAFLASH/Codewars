package com.codewars.kyu7;

public class Task2 {

    public static void main(String[] args) {
        validatePin("2134");
        validatePin("21345");
        validatePin("213");
        validatePin("2134qw");
    }

    public static boolean validatePin(String pin) {
        boolean bool;
        if (pin.length() == 4 || pin.length() ==6) {
            bool = true;
            for (int i = 0; i < pin.length(); i++) {
                if (pin.charAt(i) == '0' ||
                        pin.charAt(i) == '1' ||
                        pin.charAt(i) == '2' ||
                        pin.charAt(i) == '3' ||
                        pin.charAt(i) == '4' ||
                        pin.charAt(i) == '5' ||
                        pin.charAt(i) == '6' ||
                        pin.charAt(i) == '7' ||
                        pin.charAt(i) == '8' ||
                        pin.charAt(i) == '9') {

                } else {
                    bool = false;
                    break;
                }
            }
        } else bool = false;
        System.out.println(bool);
        return bool;
    }

    public static boolean validatePin1(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static boolean validatePin3(String pin) {

        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;

    }


}



