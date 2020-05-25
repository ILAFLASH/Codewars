package com.codewars.kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class NthSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(3));
        System.out.println(seriesSum(0));
        System.out.println(seriesSum(4));
        System.out.println(seriesSum(5));
        System.out.println(seriesSum(6));
    }

    public static String seriesSum(int n) {
        String resultString = "0.00";
        Double result = 0.0;
        if (!(n == 0)) {
            for (int i = 0; i < n; i++) {
                result += 1 / Double.valueOf(1 + i * 3);
            }
            BigDecimal roundNumber = new BigDecimal(result);
            resultString = roundNumber.setScale(2, RoundingMode.HALF_UP).toString();
        }
        return resultString;
    }
}

/*
public class NthSeries {

    public static String seriesSum(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

    }
}*/
