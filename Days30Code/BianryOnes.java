package Days30Code;

import java.util.Scanner;

/**
 *
 * @author Simone
 */
public class BianryOnes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] str = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        int max = 0;
        for (char c : str) {
            if (c == '1') {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }

}
