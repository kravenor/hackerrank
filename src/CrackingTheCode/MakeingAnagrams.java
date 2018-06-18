import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();

        String b = scanner.nextLine();
        System.out.println(changeNeeded(a,b));
        scanner.close();
    }
    public static int changeNeeded(String first, String second){
        int [] numbers=new int [26];
        for(char c:first.toCharArray())
            numbers[c-'a']++;
        for(char c:second.toCharArray())
            numbers[c-'a']--;
        int result=0;
        for (int i:numbers)
            result+=Math.abs(i);
        
        return result;
    }
}
