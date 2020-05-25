/*The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

        Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
        Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
        If the list is made up of only negative numbers, return 0 instead.

        Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.*/

package com.codewars.kyu6;

public class Max {
    public static int sequence(int[] arr) {
        int maxSum = 0;
        int sum = 0;

        if (arr.length > 0) {
            // Цикл для каждого элемента массива
            for (int i = 0; i < arr.length; i++) {

                for (int j = i; j < arr.length; j++) {

                    sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }

                    if (sum > maxSum) {
                        maxSum = sum;
                    }

                }

            }
        } else return 0;

        if (maxSum >= 0) {
            return maxSum;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] mass1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] mass2 = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        int[] mass3 = {-2, -1, -3, -4, -1, -2, -1, -5, 4};
        int[] mass4 = {};
        int[] mass5 = {0, 0, 0, 0, 0};
        System.out.println(sequence(mass1));
        System.out.println(sequence(mass2));
        System.out.println(sequence(mass3));
        System.out.println(sequence(mass4));
        System.out.println(sequence(mass5));
    }

}

/*
public class Max {
    public static int sequence(int[] arr) {
        int cur = 0, max = 0;
        for (int i : arr) {
            cur = Math.max(0, cur + i);
            max = Math.max(max, cur);
        }
        return max;
    }
}*/
