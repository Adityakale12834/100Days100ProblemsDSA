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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root == null) return null;
        if(depth == 1) {
            TreeNode temp = new TreeNode(val);
            temp.left = root;
            return temp;
        }
        return solve(root,val,depth,1);
    }
    public TreeNode solve(TreeNode root,int val , int depth,int height){
        if(root == null) return null;
        if(height == depth -1){
            TreeNode temp1 = new TreeNode(val);
            TreeNode temp2 = new TreeNode(val);
            temp1.left = root.left;
            temp2.right = root.right;
            root.left = temp1;
            root.right = temp2;
        }
        solve(root.left,val,depth,height + 1);
        solve(root.right,val,depth,height + 1);
        return root;
    }
}