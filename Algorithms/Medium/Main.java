package Algorithms.Medium;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(LongestPalindromeSubString.longestPalindrome("what time is it? I wonder what time it is right now? There must be ways to have a racecar added here!"));
//        System.out.println(LongestPalindromeSubString.longestPalindrome("what is your aba favorite band? mine is the racecar abcddcba"));
//        try {
//            FileReader fr = new FileReader("C:\\Users\\Marc\\Downloads\\mobydick.txt");
//            Scanner in = new Scanner(fr);
//            StringBuilder sb = new StringBuilder();
//            while(in.hasNext()) {
//                sb.append(in.next());
//            }
//            in.close();
//            String outString = sb.toString();
//            System.out.println(LongestPalindromeSubString.longestPalindrome(outString));
//        }
//        catch (FileNotFoundException e) {}

        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(0);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;

        /*
                                            1

                                       2          3

                                     3   4       7  8

                                        100

         */

        System.out.println(TreePathSum.treePathSum(root, 7));





    }
}
