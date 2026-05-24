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
    ArrayList<Integer> inorder = new ArrayList<>();

    public void recursion(TreeNode root){
        if(root == null){
            return;
        }

        recursion(root.left);
        inorder.add(root.val);
        recursion(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        recursion(root);
        for(Integer a:inorder){
            System.out.println(a);
        }
        return inorder.get(k - 1);
    }
}
