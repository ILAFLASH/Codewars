package com.codewars.kyu7;/*    Входные данные представляют собой строку цифр. Разрежьте строку на куски (чанк здесь является подстрокой
    исходной строки) размера sz (игнорируйте последний кусок, если его размер меньше sz).

    Если кусок представляет собой целое число, такое как сумма кубов его цифр делится на 2, переверните этот
    кусок; в противном случае поверните его влево на одну позицию. Соедините эти измененные фрагменты и верните результат в виде строки.

    Если
    sz равно <= 0 или если str пусто, вернуть ""
    sz больше (>), чем длина str, невозможно взять кусок размера sz, поэтому вернуть "".

            Examples:
            revrot("123456987654", 6) --> "234561876549"
            revrot("123456987653", 6) --> "234561356789"
            revrot("66443875", 4) --> "44668753"
            revrot("66443875", 8) --> "64438756"
            revrot("664438769", 8) --> "67834466"
            revrot("123456779", 8) --> "23456771"
            revrot("", 8) --> ""
            revrot("123456779", 0) --> ""
            revrot("5630_0065_5734_4694_85", 4) --> "0365_0650_7345_6944"*/

public class Task6 {
    public static void main(String[] args) {
        RevRot rot = new RevRot();
        System.out.println(rot.revRot("123456987654", 6));
        System.out.println(rot.revRot("123456987653", 6));
        System.out.println(rot.revRot("66443875", 4));
        System.out.println(rot.revRot("66443875", 8));
        System.out.println(rot.revRot("664438769", 8));
        System.out.println(rot.revRot("123456779", 8));
        System.out.println(rot.revRot("", 8));
        System.out.println(rot.revRot("123456779", 0));
        System.out.println(rot.revRot("563000655734469485", 4));
    }
}

class RevRot {
    public static String revRot(String strng, int sz) {
        String resultString = "";
        String subString;
        int sumOfCubes, n;
        if (!(sz <= 0 || strng == "")) {
            if (!(sz > strng.length())) {
                n = strng.length() / sz;
                for (int i = 0; i < n; i++) {
                    subString = strng.substring(i * sz, (i + 1) * sz);
                    sumOfCubes = 0;
                    for (int j = 0; j < subString.length(); j++) {
                        sumOfCubes += (Integer.valueOf(subString.substring(j, j + 1)) * Integer.valueOf(subString.substring(j, j + 1)) * Integer.valueOf(subString.substring(j, j + 1)));
                    }
                    if (sumOfCubes % 2 == 0) {
                        for (int j = subString.length() - 1; j >= 0; j--) {
                            resultString += subString.charAt(j);
                        }
                    } else {
                        resultString += subString.substring(1) + subString.charAt(0);
                    }
                }
                return resultString;
            }
            return "";
        }
        return "";
    }
}