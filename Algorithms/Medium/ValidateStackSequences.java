package Algorithms.Medium;

import java.util.Stack;

public class ValidateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped){

        int pushedIndex = 1;
        int poppedIndex = 0;
        Stack<Integer> testStack = new Stack<>();
        testStack.push(pushed[0]);

        while(pushedIndex != pushed.length || poppedIndex != popped.length){

            if(!testStack.isEmpty() && popped[poppedIndex] == testStack.peek()){
                testStack.pop();
                poppedIndex++;
            }else if (pushedIndex != pushed.length){
                testStack.push(pushed[pushedIndex]);
                pushedIndex++;
            } else{
                return false;
            }
        }
        return true;
    }
}
