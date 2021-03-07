package Algorithms.Medium;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(LongestPalindromeSubString.longestPalindrome("what time is it? I wonder what time it is right now? There must be ways to have a racecar added here!"));

        try {
            FileReader fr = new FileReader("C:\\Users\\Marc\\Downloads\\mobydick.txt");
            Scanner in = new Scanner(fr);
            StringBuilder sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(in.next());
            }
            in.close();
            String outString = sb.toString();
            System.out.println(LongestPalindromeSubString.longestPalindrome(outString.substring(0,4000)));
        }
        catch (FileNotFoundException e) {}

    }
}
