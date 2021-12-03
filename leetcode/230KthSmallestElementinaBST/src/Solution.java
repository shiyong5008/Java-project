import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    List<Integer> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {

        inorder(root);
        // Collections.sort(list);
        return list.get(k-1);

    }

    public void inorder(TreeNode root) {

        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);

    }
}