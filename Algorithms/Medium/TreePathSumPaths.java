package Algorithms.Medium;

import java.util.ArrayList;
import java.util.List;

public class TreePathSumPaths {

    public static List<List<Integer>> treePathsToSum(TreeNode root, int sum){
        // traverse and return *all* and not just true/false
        List<List<Integer>> visitedSoFar = new ArrayList<>();
        searchTree(root, sum, visitedSoFar, new ArrayList<Integer>());
        return visitedSoFar;
    }


    private static void searchTree(TreeNode node, int sum, List<List<Integer>> visitedSoFar, ArrayList<Integer> curr){
        if(node == null){return;}
        curr.add(node.val);

        if(node.val == sum && node.left == null && node.right == null){
            visitedSoFar.add(curr);
            return;
        }

        searchTree(node.left, sum - node.val, visitedSoFar, new ArrayList<Integer>(curr));
        searchTree(node.right, sum - node.val, visitedSoFar, new ArrayList<Integer>(curr));

    }

}
