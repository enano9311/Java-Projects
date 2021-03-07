package Algorithms.Medium;

public class LongestPalindromeSubString {

    public static String longestPalindrome(String s){

        String[] allSubstrings = new String[s.length() * s.length()];
        int i = 0;
        String longestPal = "";
        int longestPalLength = 0;

        for(int startingPosition = 0; startingPosition < s.length(); startingPosition ++){
            // construct all strings0
            for(int endPosition = startingPosition + 1; endPosition <= s.length(); endPosition ++){
                allSubstrings[i] = s.substring(startingPosition, endPosition);
                i++;            }
        }
        StringBuilder sb = new StringBuilder();
        String revStr;
        for(String possiblePal : allSubstrings){
            if(possiblePal != null && possiblePal.equals(new StringBuilder(possiblePal).reverse().toString()) && possiblePal.length() > longestPalLength){
                longestPalLength = possiblePal.length();
                longestPal = possiblePal;
            }
        }
        return longestPal;
    }
}
