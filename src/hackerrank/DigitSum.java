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
public class DigitSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger num = scan.nextBigInteger();
        BigInteger dieci = new BigInteger("10");
        num = num.subtract(BigInteger.ONE);
        num = num.pow(num.intValue());
        //System.out.println("Num:"+num);

        BigInteger sum = BigInteger.ZERO;
        while (num.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(num.mod(dieci));
            num = num.divide(dieci);
        }
        scan.close();
        System.out.println(sum);
    }
}
