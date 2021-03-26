package Algorithms.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderBinaryTreeTraversal {

    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();

        if(root == null){
            return traversal;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            traversal.add(0, current.val);

            if(current.left != null ){stack.push(current.left);}
            if(current.right != null){stack.push(current.right);}
        }

        return traversal;
    }
}
