package Algorithms.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class LongestWord {

    public static String longestWord(String[] words){

        boolean isOK;
        String longestWord = "";
        HashSet<String> wordsSoFar = new HashSet<>();
        for(String word : words){
            wordsSoFar.add(word);
        }

        for(String word : words){
            isOK = true;
            for(int i = 1; i <= word.length(); i--){
                if(!wordsSoFar.contains(word.substring(0,i))){
                    isOK = false;
                }
            }
            if(isOK && word.length() >= longestWord.length()){
                //check which is lex... shorter, and set it to that
                //1. sort them, and take first OR use compareTo with if
                String[] tmp = new String[]{word, longestWord};
                Arrays.sort(tmp);
                longestWord = tmp[0];
            }
        }

        return longestWord;
    }
}
