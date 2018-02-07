package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Simone Baldelli
 */
public class MaximizingXOR {

    static int maxXor(int l, int r) {
        int maxor = 0;
        for (int i = l; i <= l + (r - l); i++) {
            for (int j = l; j <= l + (r - l); j++) {
                //System.out.println(i + ";" + j + "=" + (i^j));
                if ((i ^ j) > maxor) {
                    maxor = (i ^ j);

                }
            }

        }
        return maxor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
