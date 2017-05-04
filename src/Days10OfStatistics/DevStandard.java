/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Days10OfStatistics;

import java.util.Scanner;

/**
 *
 * @author kravenor
 */
public class DevStandard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int [n];
        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();
        double mean=0;
        for(int i=0;i<n;i++)
            mean+=arr[i];
        mean=mean/n;
        double sigma2=0;
        for(int i=0;i<n;i++)
            sigma2+=Math.pow((arr[i]-mean),2);
        
        
        System.out.printf("%.1f",Math.sqrt(sigma2/n));
    }
}
