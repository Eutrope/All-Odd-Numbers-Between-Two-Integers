/**
 * Created by HaMi on 2017-09-29.
 * This program takes in two integers as input and returns an array of all the odd numbers between the two values
 * I am going to use an ArrayList since we do not know what size array we are going to get from retrieving all odd numbers between the two values
 * Then, I will copy all the contents of the ArrayList into an array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int second = sc.nextInt();

        int[] test = getOdd(first, second);
        System.out.println(Arrays.toString(test));
    }

    private static int[] getOdd(int l, int r) {
        ArrayList<Integer> oddNums = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 == 1) {
                oddNums.add(i);
            }
        }

        int[] results = new int[oddNums.size()];
        for (int i = 0; i < oddNums.size(); i++) {
            results[i] = oddNums.get(i);
        }
        return results;
    }
}
