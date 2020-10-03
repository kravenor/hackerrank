/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days10OfStatistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kravenor
 */
public class Quartiles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] low = new int[n / 2];
        int[] upper = new int[n / 2];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        if (a.length % 2 == 0) {
            System.arraycopy(a, 0, low, 0, low.length);
            System.arraycopy(a, a.length / 2, upper, 0, upper.length);
        } else {
            System.arraycopy(a, 0, low, 0, low.length);
            for (int i = 0; i < upper.length; i++) {
                upper[i] = a[(a.length / 2 + 1) + i];
            }
        }

        //  Arrays.sort(low);
        //Arrays.sort(upper);
        System.out.println((int) median(low));
        System.out.println((int) median(a));
        System.out.println((int) median(upper));
    }

    public static double median(int[] arr) {
        int N = arr.length;

        if (N % 2 != 0) {
            return (arr[N / 2]);
        } else {
            return ((arr[N / 2 - 1] + arr[N / 2]) / 2f);
        }
    }
}
