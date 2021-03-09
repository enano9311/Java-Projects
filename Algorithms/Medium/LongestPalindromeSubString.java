package Algorithms.Medium;

public class LongestPalindromeSubString {

    public static String longestPalindrome(String s){

        String longestPal = null;
        int longestPalLength = 0;
        String possiblePal;
        String trimmedString = s.replaceAll("[^a-zA-Z]","").toLowerCase();

        // brute force. Make all substrings, check if they are palindromic
        // better method: iterate over list, and see what the longest palindrome at each letter is (if any)
        for(int pos = 0; pos < trimmedString.length(); pos ++){
            if(pos - 1 < 0 || pos + 1 >= trimmedString.length()){continue;}
            possiblePal = trimmedString.substring(pos -1, pos + 2);
            if(possiblePal.equals(new StringBuilder(possiblePal).reverse().toString())){
                String pre = trimmedString.substring(0, pos - 1);
                String post = trimmedString.substring(pos + 2);
                String pal = longestPalCenteredAt(pre, possiblePal, post);
                if(pal.length() > longestPalLength){
                    longestPalLength = pal.length();
                    longestPal = pal;
                }
            }

            if(trimmedString.charAt(pos) == trimmedString.charAt(pos + 1)){
                String pre = trimmedString.substring(0, pos + 1);
                String post = trimmedString.substring(pos + 1);
                String pal = longestPalCenteredAt(pre,"", post);
                if(pal.length() > longestPalLength){
                    longestPalLength = pal.length();
                    longestPal = pal;
                }
            }
        }
        return longestPal;
    }


    private static String longestPalCenteredAt(String pre, String mid, String post){
        if(pre.length() == 0 || post.length() == 0){return mid;}
        if(pre.charAt(pre.length() - 1) == post.charAt(0)){
            String longerPal = pre.charAt(pre.length() - 1) + mid + post.charAt(0);
            return longestPalCenteredAt(pre.substring(0, pre.length() - 1), longerPal, post.substring(1));
        }
        else {return mid;}
    }

}
