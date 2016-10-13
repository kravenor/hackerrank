package hackerrank.CrackingTheCodingInterview;

import java.util.*;

/**
 *
 * @author Simone Baldelli
 * @site http;//kravenor.altervista.org
 */
public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack();
        boolean isbalanced = true;
        //Queue<Character> queue=new LinkedList<>();
        char[] exp = expression.toCharArray();
        for (char c : exp) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                // queue.add(c);
            } else if (stack.empty()) {
                isbalanced = false;
                break;
            } else {
                char top = stack.pop();
                if ((top == '(' && c == ')')
                        || (top == '[' && c == ']')
                        || (top == '{' && c == '}')) {
                    isbalanced = true;
                    break;

                }else{isbalanced=false;}
            }
        }
        return (isbalanced&&stack.empty())?true:false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if (answer) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
