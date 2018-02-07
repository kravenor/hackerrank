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
public class DTypes {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j = scan.nextInt();
        double dd = scan.nextDouble();
        String ss = scan.nextLine();

        /* Read and save an integer, double, and String to your variables.*/

 /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        System.out.println(d + dd);
        System.out.println(s + ss);
        /* Print the sum of the double variables on a new line. */

 /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
    }

}
