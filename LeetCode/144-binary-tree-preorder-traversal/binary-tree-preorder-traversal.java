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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;
    }
    private void preorder(TreeNode Node ,ArrayList<Integer> result){
        if(Node==null) return;
            result.add(Node.val);
            preorder(Node.left,result);
            preorder(Node.right,result);

    }
}