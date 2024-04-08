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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0,inorder.length-1,0,postorder.length-1,inorder,postorder);
    }
    public TreeNode helper(int InStart,int InEnd,int postStart,int PostEnd,int[] inorder,int[] postorder){
        if(InStart > InEnd || postStart > PostEnd){
            return null;
        }
        int rootval = postorder[PostEnd];
        TreeNode tree = new TreeNode(rootval);

        int index=0;
        for(int i=InStart;i<=InEnd;i++){
            if(inorder[i] == rootval){
                index = i;
                break;
            }
        }
        int leftsize = index - InStart;
        int rightsize = InEnd - index;
        tree.left = helper(InStart,index-1,postStart,postStart+leftsize-1,inorder,postorder);
        tree.right = helper(index+1,InEnd,PostEnd-rightsize,PostEnd-1,inorder,postorder);
        return tree;
    }
}