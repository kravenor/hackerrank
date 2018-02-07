/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days10OfStatistics;

/**
 * Task Given an array, , of integers, calculate and print the the respective
 * mean, median, and mode on separate lines. If your array contains more than
 * one modal value, choose the numerically smallest one.
 *
 * Note: Other than the modal value (which will always be an integer), your
 * answers should be in decimal form, rounded to a scale of decimal place
 * (i.e.,12.3,7.0 format).
 *
 * Input Format
 *
 * The first line contains an integer, , denoting the number of elements in the
 * array. The second line contains space-separated integers describing the
 * array's elements.
 *
 * Constraints 10<=N<=2500 0<=xi<=10^5, where xi is the ith element of the
 * array.
 *
 * Output Format
 *
 * Print lines of output in the following order:
 *
 * 1. Print the mean on a new line, to a scale of decimal place (i.e.,12.3,7.0).
 * 2. Print the median on a new line, to a scale of decimal
 * place(i.e.,12.3,7.0). 3. Print the mode on a new line; if more than one such
 * value exists, print the numerically smallest one.
 *
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MeanMedianMode {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        double mean = 0, median = 0;

        N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            mean += arr[i];
        }
        mean = mean / N;
        Arrays.sort(arr);
        if (N % 2 != 0) {
            median = arr[N / 2 + 1];
        } else {
            median = (arr[N / 2 - 1] + arr[N / 2]) / 2f;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
            int occurrences = map.get(num);
            if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
                maxOccurrences = occurrences;
                mode = num;
            }
        }

        System.out.printf("%.1f%n", mean);
        System.out.printf("%.1f%n", median);
        System.out.println(mode);

    }

    private static int getMode(int[] array) {
        HashMap<Integer, Integer> hm = new HashMap< Integer, Integer>();
        int max = 1, temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (hm.get(array[i]) != null) {
                int count = hm.get(array[i]);
                count = count + 1;
                hm.put(array[i], count);
                if (count > max) {
                    max = count;
                    temp = array[i];
                }
            } else {
                hm.put(array[i], 1);
            }
        }
        System.out.println(hm + " \n" + temp);
        return temp;
    }
}
