package Algorithms.Easy;

public class MakeChange {

    public static int makeChange(int amount, int[] denoms, int m){
        if(amount == 0){return 1;}
        if(amount < 0){ return -1;}

        if(m <= 0 && amount >= 1){return 0;}

        return makeChange(amount, denoms, m - 1) + makeChange(amount - denoms[m - 1], denoms, m);
    }
}
