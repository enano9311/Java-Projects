package Algorithms.Medium;

public class InsertIntoBST {
    public static TreeNode InsertIntoBST(TreeNode root, int val){
        // assume that there is no collision
        // left < root < right
        // if we need to keep in balanced, we have to do additional work

        if(val > root.val){
            //go left
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                InsertIntoBST(root.right, val);
            }
        }

        if(val < root.val){
            //go right
            if(root.left == null){
                root.left = new TreeNode(val);
            } else{
                InsertIntoBST(root.left, val);
            }
        }

        return root;
    }

}

/*
            6
         4      7
      3     5  2  10


      val = 1
 */
