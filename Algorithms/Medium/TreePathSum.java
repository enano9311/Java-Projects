package Algorithms.Medium;

import Algorithms.Medium.TreeNode;

public class TreePathSum {
    public static boolean treePathSum(TreeNode root, int sum){
        //
        int partialSum = 0;
        boolean left = false;
        boolean right = false;
        partialSum += root.val;
        //System.out.println("at " + root.val + " with a partialSum of " + partialSum);
        if (root.left != null){
            left = treePathSum(root.left, sum - partialSum);
        }
        if (root.right != null){
            right = treePathSum(root.right, sum - partialSum);
        }
        if(partialSum == sum){
            return true;
        } else{
            return left || right;
        }
    }

}
