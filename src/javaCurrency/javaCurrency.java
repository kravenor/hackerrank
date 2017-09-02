/*
 * Given a double-precision number, payment, 
 * denoting an amount of money, use the NumberFormat class' getCurrencyInstance 
 * method to convert payment into the US, Indian, Chinese, and French currency 
 * formats. Then print the formatted values as follows:
 *    US: formattedPayment
 *    India: formattedPayment
 *    China: formattedPayment
 *    France: formattedPayment
 * 
 *   where formattedPayment is payment formatted according to the appropriate 
 *   Locale's currency.
 */
package javaCurrency;

import java.util.*;
import java.text.*;

/**
 *
 * @author kravenor
 */
public class javaCurrency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Define the India Locale
        Locale indiaLocale = new Locale("en", "IN");
        
        //Apply the locale
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        //Print result
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
