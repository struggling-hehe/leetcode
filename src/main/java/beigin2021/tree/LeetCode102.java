package beigin2021.tree;

/**
 * 层序遍历
 *
 * @date 2021/06/02
 */

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class LeetCode102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new LinkedList<List<Integer>>();
        if (root == null) {
            return li;
        }
        List<Integer> list = new LinkedList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode q = null;
        TreeNode index = root;
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            list.add(p.val);
            if (p.left != null) {
                queue.add(p.left);
                q = p.left;
            }
            if (p.right != null) {
                queue.add(p.right);
                q = p.right;
            }

            if (index == p) {
                li.add(list);
                list = new LinkedList<Integer>();
                index = q;
            }
        }
        return li;
    }

}












