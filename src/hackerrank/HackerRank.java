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
public class HackerRank {

     public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1 ||((n%2==0)&&(6<=n && n<=20))){
              ans = "Weird";
            }
            else{
            
               ans="Not Weird";
                
            }
            System.out.println(ans);
            
        }
    }