package ProjectEuler;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargeSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int length = scan.nextInt(); 
    scan.nextLine();
    // using BigInteger : Initializing at 0
    BigInteger sum = new BigInteger("0");
    String temp;
    for(int x=0;x<length;x++){
        temp = scan.nextLine();
        BigInteger tempInt = new BigInteger(temp);      
        sum = sum.add(tempInt);
    }
    String result =  sum + "";
   System.out.println(result.substring(0,10));
    }
}
