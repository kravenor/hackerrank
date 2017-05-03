/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class Solution4 {
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
        BigInteger a=scan.nextBigInteger();
        BigInteger b=scan.nextBigInteger();
        
        
        System.out.println(a+" + "+b+"="+a.add(b));
        System.out.println(a+" x "+b+"="+a.multiply(b));
    }
    
}
