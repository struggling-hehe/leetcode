package beigin2021.tree;

/**
 * 层序遍历
 * @date 2021/06/02
 */

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class LeetCode102 {

    public List<List<Integer>> levelOrder(Node root) {
        List<Integer> list = new LinkedList<Integer>();
        List<List<Integer>> li = new LinkedList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null){
            queue.add(root);
        }
        TreeNode q = null;
        while (!queue.isEmpty()){
            TreeNode p = queue.poll();
            if (p.left != null){
                queue.add(p.left);
                q = p.left;
            }
            if (p.right != null){
                queue.add(p.right);
                q = p.right;
            }
            list.add(p);
            if (p == q){
                li.add(list);
                list.clear();
            }
        }

    }
    public static void main(String[] args) {

    }
}












