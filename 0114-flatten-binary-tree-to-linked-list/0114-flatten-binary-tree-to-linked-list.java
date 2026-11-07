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
    public TreeNode flattentree(TreeNode node){
        if(node==null)return node;
        if(node.left==null&&node.right==null)return node;

        TreeNode leftmar=flattentree(node.left);
        TreeNode rightmar=flattentree(node.right);
        if(leftmar!=null){
            leftmar.right=node.right;
            node.right=node.left;
            node.left=null;
        }
        return rightmar==null?leftmar:rightmar;


    }
    public void flatten(TreeNode root) {
         flattentree(root);
        
    }
}