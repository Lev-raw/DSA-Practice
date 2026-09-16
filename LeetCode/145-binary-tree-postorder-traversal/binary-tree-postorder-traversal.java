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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
           postorder(root,list);
           return list; 
    }
    private void postorder(TreeNode Node, ArrayList<Integer> list){
        if(Node==null)return;
          postorder(Node.left,list);
          postorder(Node.right,list);
          list.add(Node.val);
    }
}