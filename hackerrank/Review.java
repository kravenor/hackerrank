/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class Review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String[] str = new String[T];
        for (int j = 0; j < T; j++) {
            str[j] = scan.next();
        }
        for (int j = 0; j < T; j++) {
            char[] crArr = str[j].toCharArray();
            for (int i = 0; i < crArr.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(crArr[i]);
                }
            }
            System.out.print(" ");

            for (int i = 0; i < crArr.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(crArr[i]);
                }
            }
        }
    }
}
