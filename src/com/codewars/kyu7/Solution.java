/*There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!

        input
        customers: an array of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
        n: a positive integer, the number of checkout tills.
        output
        The function should return an integer, the total time required.

        Important
        Please look at the examples and clarifications below, to ensure you understand the task correctly :)

        Examples
        queueTime([5,3,4], 1)
// should return 12
// because when there is 1 till, the total time is just the sum of the times

        queueTime([10,2,3,3], 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the
// queue finish before the 1st person has finished.

        queueTime([2,3,10], 2)
// should return 12
        Clarifications
        There is only ONE queue serving many tills, and
        The order of the queue NEVER changes, and
        The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
        N.B. You should assume that all the test input will be valid, as specified above.

        P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool, with
        relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool*/

package com.codewars.kyu7;

import java.util.Arrays;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] checkoutTills = new int[n];
        int minTime = 0;            //  Минимальный элемент
        int indexOfMinTime = 0;     //  Индекс минимального элемента
        int totalTime = 0;
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < n; j++) {
                // Поиск минимального элемента
                if (checkoutTills[j] < minTime) {
                    minTime = checkoutTills[j];
                    indexOfMinTime = j;
                }
                //Поиск максимльного элемента
                if (checkoutTills[j] > totalTime) {
                    totalTime = checkoutTills[j];
                }
            }
            checkoutTills[indexOfMinTime] += customers[i];
            minTime = checkoutTills[indexOfMinTime];
            if (minTime > totalTime) {
                totalTime = minTime;
            }
        }
        System.out.println(Arrays.toString(customers));
        System.out.println(Arrays.toString(checkoutTills) + " , " + totalTime);
        return totalTime;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 3, 4};
        int[] array2 = {10, 2, 3, 3};
        int[] array3 = {2, 3, 10};
        solveSuperMarketQueue(array1, 1);
        solveSuperMarketQueue(array2, 2);
        solveSuperMarketQueue(array3, 2);
    }
}

/*
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] result = new int[n];
        for(int i = 0; i < customers.length; i++){
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

}*/
