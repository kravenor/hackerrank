/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days10OfStatistics;

import java.util.Scanner;

/**
 *
 * @author kravenor
 */
public class WeightedMean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;

        N = in.nextInt();
        int[] arr = new int[N];
        int[] weight = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            weight[i] = in.nextInt();
        }
        int num = 0, den = 0;
        for (int i = 0; i < N; i++) {
            num += (arr[i] * weight[i]);
        }
        for (int i = 0; i < N; i++) {
            den += weight[i];
        }
        double mean = (num / (double) den);
        System.out.println(mean);
        System.out.printf("%.1f%n", mean);
    }
}
