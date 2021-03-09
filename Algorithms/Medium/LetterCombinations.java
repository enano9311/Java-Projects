package Algorithms.Medium;

import java.util.*;

public class LetterCombinations {
    public static List<String> letterCombinations(String digits){

        String[] startingDigits = digits.split("");
        List<String> finalStrings = new ArrayList<String>();
        Map<String, String[]> textKeyboard = new HashMap<String, String[]>();

        textKeyboard.put("2", new String[] {"a","b","c"});
        textKeyboard.put("3", new String[] {"d","e","f"});
        textKeyboard.put("4", new String[] {"g","h","i"});
        textKeyboard.put("5", new String[] {"j","k","l"});
        textKeyboard.put("6", new String[] {"m","n","o"});
        textKeyboard.put("7", new String[] {"p","q","r","s"});
        textKeyboard.put("8", new String[] {"t","u","v"});
        textKeyboard.put("9", new String[] {"w","x","y","z"});

        for(String key : startingDigits){
            constructAllCombinations(finalStrings, textKeyboard.get(key));
        }
        return finalStrings;
    }


    private static void constructAllCombinations(List<String> finalStrings, String[] lettersToAdd){

        List<String> toAdd = new ArrayList<String>();
        if(finalStrings.size() == 0){
            for(String letter : lettersToAdd){
                toAdd.add(letter);
            }
        } else{
            for(String str : finalStrings){
                for(String newLetter : lettersToAdd){
                    toAdd.add(str + newLetter);
                }
            }

        }
        finalStrings.clear();
        finalStrings.addAll(toAdd);
    }

}
