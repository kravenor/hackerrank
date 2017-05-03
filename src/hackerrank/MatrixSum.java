/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *Calcola la somma diagonale della matrice di dimensione nxn
 * @author Simone
 */
public class MatrixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int diag_a=0;
        for(int i=0;i<n;i++)
            diag_a+=a[i][i];
        int diag_b=0;
        for(int i=n-1;i>=0;i--)
            diag_b+=a[i][n-i-1];
        
        int sum=Math.abs(diag_a-diag_b);
        System.out.println(diag_a);
        System.out.println(diag_b);
        System.out.println(sum);
    }
    
}
