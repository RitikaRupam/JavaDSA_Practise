package Recursion.SelfPractise_Recursion;

import java.util.ArrayList;

public class PerfectNumber {
    public static  ArrayList<Integer> perfect(int n) {
        ArrayList<Integer> perfectNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)) {
                perfectNumbers.add(i);
            }
        }

        return perfectNumbers;
    }

    private static  boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }


    public static void main(String[] args) {
        System.out.println(perfect(1000));
    }
}