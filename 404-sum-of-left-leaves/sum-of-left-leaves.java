/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root,false,0);
    }
    public int sumOfLeftLeaves(TreeNode root, boolean val,int sum){
        if(root == null ){
            return 0;
        }
        if(root.left == null && root.right == null && val){
            return sum += root.val;
        }
        return sumOfLeftLeaves(root.left,true,sum) + sumOfLeftLeaves(root.right,false,sum);
    }
}