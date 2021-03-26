package Algorithms.Easy;

import java.util.Arrays;

public class HighestTripleProduct {

    public static Integer largestProduct(int[] listOfInts){
        // Just take the highest 3 values?
        // if one is negative, we have to consider that we might choose a smaller other number that is also negative. eg {10,100,-1,1,2,3,4,6,-1000000000} we want to choose 100,-1,-1000000000 ONLY IF WE CAN MAKE IT NON-NEGATIVE
        // can do it linear, keep track of two smallest and three largest in a single scan over the array. Return max of 2 smallest and largest and 3 largest
        Arrays.sort(listOfInts);
        int len = listOfInts.length;
        return Math.max(
                listOfInts[0] * listOfInts[1] * listOfInts[len],
                listOfInts[len] * listOfInts[len - 1] * listOfInts[len - 2]
                );
    }
}
