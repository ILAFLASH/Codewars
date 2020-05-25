package com.codewars.kyu7;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(DescendingOrder.sortDesc(123));
        System.out.println(DescendingOrder.sortDesc(32423543));
        System.out.println(DescendingOrder.sortDesc(12369647));
        System.out.println(DescendingOrder.sortDesc(145743645));
        System.out.println(DescendingOrder.sortDesc(167867823));
        System.out.println(DescendingOrder.sortDesc(167867867));
    }

}

class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            String stringNum = Integer.toString(num);
            String resultString = "";
            for (int i = 0; i < stringNum.length(); i++) {
                arrayList.add(Integer.valueOf(stringNum.substring(i, i + 1)));
            }
            Collections.sort(arrayList, Collections.reverseOrder());
            for (int i = 0; i < stringNum.length(); i++) {
                resultString += arrayList.get(i);
            }
            return Integer.valueOf(resultString);
        } else
            return 0;
    }
}

/*
public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}*/
