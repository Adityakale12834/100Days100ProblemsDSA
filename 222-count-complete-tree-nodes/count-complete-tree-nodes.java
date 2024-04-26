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
    public int countNodes(TreeNode root) {
        return DFS(root,1);
    }
    public int DFS(TreeNode root,int n){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return n;
        }
        int val=0;
        int val2=0;
        if(root.left != null){
            val = DFS(root.left,n+1);
        }
        if(root.right != null){
            val2 = DFS(root.right,val+1);
        }
        return Math.max(val,val2);
    }
}