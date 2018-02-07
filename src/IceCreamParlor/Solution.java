/*
 * Problem statement here: https://www.hackerrank.com/challenges/icecream-parlor/problem
 *
 */
package IceCreamParlor;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int money = in.nextInt();
            int flavors = in.nextInt();

            Map<Integer, Integer> complementi = new HashMap<>();

            for (int i = 1; i <= flavors; i++) {
                int cost = in.nextInt();
                if (complementi.containsKey(cost)) {
                    System.out.println(complementi.get(cost) + " " + i);
                } else {
                    complementi.put(money - cost, i);
                }
            }
        }
        in.close();
    }
}
