package Algorithms.Easy;

public class MaxProductFromSub {

    public static int[] findSubArray(int[] array){
        if(array.length < 3){ return null;}
        if(array.length == 3){return array;}

        int maxSoFar = 0;
        int startingIndex = 0;
        for(int i = 0; i < array.length - 2; i++){
            //look at current val and next 2
            if(array[i + 2] > array[i + 1] && array[i + 1] > array[i]){
                int subTotal = array[i + 2] + array[i + 1] + array[i];
                if(subTotal > maxSoFar){
                    maxSoFar = subTotal;
                    startingIndex = i;
                }
            }
        }
        return array;
    }

}
