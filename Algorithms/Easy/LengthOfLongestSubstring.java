package Algorithms.Easy;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public Integer lengthOfLongestSubstring(String s)
    {
        List<Character> seenChars = new ArrayList<>();
        char currentChar;
        for(int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; i < s.length(); j++)
            {
                currentChar = s.charAt(i);
                if(!seenChars.contains(currentChar))
                {
                    seenChars.add(currentChar);
                    return null;
                }
            }
            return null;

        }

        return null;
    }
}
