package Algorithms.Medium;

public class LongestPalindromeSubString {

    public static String longestPalindrome(String s){

        String longestPal = null;
        int longestPalLength = 0;
        String possiblePal;
        String trimmedString = s.replaceAll("\\s","").replace(".","");

        for(int startingPosition = 0; startingPosition < trimmedString.length(); startingPosition ++){
            for(int endPosition = startingPosition + 1; endPosition <= trimmedString.length(); endPosition ++){
                possiblePal = trimmedString.substring(startingPosition, endPosition);

                if(possiblePal.equals(new StringBuilder(possiblePal).reverse().toString()) && possiblePal.length() > longestPalLength){
                    longestPalLength = possiblePal.length();
                    longestPal = possiblePal;
                    }
                }
        }
        return longestPal;
    }
}
