/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author kravenor
 */
public class AlgorithmicCrush {

    /*
    public static void main(String[] args) {
        int N, M, a, b,k, max;
        Scanner in = new Scanner(System.in);
        max = 0;
        N = in.nextInt();
        int[] arr = new int[N];
        M = in.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < M; i++) {
            a = in.nextInt();
            b = in.nextInt();
            k = in.nextInt();
            for (int j = a; j < b; j++) {
                arr[j] +=k;
            }

        }
        for (int i = 0; i < N; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        /* Save interval endpoint's "k" values in array */
        long[] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a - 1] += k;
            array[b] -= k;
        }
        scan.close();

        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }

}
