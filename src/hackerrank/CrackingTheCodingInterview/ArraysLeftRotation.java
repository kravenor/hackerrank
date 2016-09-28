package hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author Simone Baldelli
 */
public class ArraysLeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, d);
        for(int i =0;i<n;i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
 public static int[] arrayLeftRotation(int[] a, int n, int d) {
      int []rotated=new int[n];
      System.arraycopy(a, d, rotated, 0, n-d);
    System.arraycopy(a, 0, rotated, n-d, d);
      return rotated;
    }
}
