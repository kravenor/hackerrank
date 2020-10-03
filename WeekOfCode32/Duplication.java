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
public class Duplication {

    static String duplication(int x) {
        String a = "0";
        while (a.length() <= 1000) {
            for (char c : a.toCharArray()) {
                if (c == '0') {
                    a += '1';
                } else {
                    a += '0';
                }
            }
        }

        return ("" + a.charAt(x));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}
