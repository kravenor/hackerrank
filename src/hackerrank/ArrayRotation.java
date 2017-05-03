/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] ar = new int[n];
        int[] query = new int[q];
        k %= n;
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int tmp = ar[ar.length - 1];
            for (int j = ar.length - 2; j >= 0; j--) {
                ar[j + 1] = ar[j];
            }
            ar[0] = tmp;
        }
        System.out.println("Array:" + Arrays.toString(ar));
        for (int i = 0; i < q; i++) {
            query[i] = scan.nextInt();
        }
        for (int j = 0; j < q; j++) {
            System.out.println(ar[query[j]]);
        }

    }

    public static void alternativeAndEfficient() {
        Scanner in = new Scanner(System.in);
        int n, k, q;
        n = in.nextInt();
        k = in.nextInt();
        q = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[(i + k) % n] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            System.out.println(arr[in.nextInt()]);
        }

    }

}
