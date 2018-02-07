package ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Simone Baldelli
 */
public class Multipli3o5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger T = scan.nextBigInteger();
        BigInteger N;
        for (int j = 0; BigInteger.valueOf(j).compareTo(T) < 0; j++) {
            N = scan.nextBigInteger();
            int sum = 0;
            for (int i = 0; BigInteger.valueOf(i).compareTo(N) < 0; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);

        }
    }

}
