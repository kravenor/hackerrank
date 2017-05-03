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
public class Binary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=Integer.parseInt(Integer.toBinaryString(scan.nextInt()));
        int b=Integer.parseInt(Integer.toBinaryString(scan.nextInt()));
        int n=314159;
        long sum=0;
        for(int i=0;i<n;i++)
            sum+=(a^(b<<i));
        System.out.println(sum);
    }


}
