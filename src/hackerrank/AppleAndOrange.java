/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author kravenor
 */
import java.util.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int appSum = 0, oranSum = 0;

        for (int apple_i = 0; apple_i < m; apple_i++) {
            int applPosition = a + in.nextInt();
            if (applPosition >= s && applPosition <= t) {
                appSum++;
            }
        }
        for (int orange_i = 0; orange_i < n; orange_i++) {
            int orangePosition = b + in.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                oranSum++;
            }

        }

        System.out.println(appSum);
        System.out.println(oranSum);
        in.close();
    }
}
