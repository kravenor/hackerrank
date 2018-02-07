/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author kravenor
 */
public class AnagramChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert first word: ");
        String a = in.nextLine();
        a = a.toLowerCase();
        System.out.print("Insert first word: ");
        String b = in.nextLine().toLowerCase();
        in.close();
        System.out.println(check(a, b) ? "Is an Anagram" : "Isn't an anagram");
    }

    public static boolean check(String a, String b) {
        b=b.toLowerCase();
        a=a.toLowerCase();
        HashMap<Character, Integer> mapA = new HashMap<>();
        boolean ana = false;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            Integer val = mapA.get(new Character(c));
            if (val != null) {
                mapA.put(c, new Integer(val + 1));
            } else {
                mapA.put(c, 1);
            }
        }
        HashMap<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            Integer val = mapB.get(c);
            if (val != null) {
                mapB.put(c, new Integer(val + 1));
            } else {
                mapB.put(c, 1);
            }
        }
        if (mapA.size() != mapB.size()) {
            ana = false;
            return false;
        } else if (mapA.equals(mapB)) {
            ana = true;
            return true;
        }
        return ana;
    }

}
