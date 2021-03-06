/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class html {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String string;
        String regexOnlyTag = "[<][\\W]*+[a][\\W]*href=\"[\\W]*[^>]+";
        String regexHTML = "[>][^>]*[<][\\W]*[/][\\W]*[a|b|h|H][\\w]{0,1}[\\W]*[>]";
        String regexATag = "[\\[]";
        Pattern tagPattern = Pattern.compile(regexOnlyTag);
        Pattern htmlPattern = Pattern.compile(regexHTML);
        Set<String> tagSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            string = in.nextLine();
            Matcher tagMatcher = tagPattern.matcher(string);
            Matcher htmlMatcher = htmlPattern.matcher(string);
            while (tagMatcher.find()) {
                String temp = string.substring(tagMatcher.start(), tagMatcher.end());
                temp = temp.trim();
                String[] temparr = temp.split("\"");
                String tempNew = temparr[1].trim();
                System.out.print(tempNew + ",");

                if (htmlMatcher.find()) {
                    String temp2 = string.substring(htmlMatcher.start(), htmlMatcher.end());
                    temp2 = temp2.trim();
                    String[] temparr2 = temp2.split("<");
                    String tempNew2 = temparr2[0].replace(">", "").trim();
                    System.out.println(tempNew2);
                } else {
                    System.out.println();
                }
            }
        }
    }
}
