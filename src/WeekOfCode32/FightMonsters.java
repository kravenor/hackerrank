/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode32;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author kravenor
 */
public class FightMonsters {

    static int getMaxMonsters(int n, int hit, int t, int[] h) {
        int max = 0;
        int t1 = t;
        Arrays.sort(h);
        for (int i = 0; i < t1; i++) {
            h[i] = h[i] - hit;
            if (h[i] <= 0) {
                max++;
            } else {
                while (h[i] > 0 && t1 > 0) {
                    h[i] = h[i] - hit;
                    t1--;
                }
                if (h[i] <= 0) {
                    max++;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }
}
