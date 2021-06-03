package beigin2021.tree;

import sun.tools.tree.BooleanExpression;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * 二叉树的之字形遍历，也是锯齿形遍历
 * <p>
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回锯齿形层序遍历如下：
 * <p>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 */

public class LeetCode103 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new LinkedList<List<Integer>>();
        if (root == null) {
            return li;
        }
        List<Integer> list = new LinkedList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        queue.add(root);
        TreeNode q = null;
        TreeNode index = root;
        Boolean is = false;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            TreeNode p;
            if (is && !stack.isEmpty()) {
                p = stack.pop();
                if (p.left != null) {
                    queue.add(p.left);
                    q = p.left;
                }
                if (p.right != null) {
                    queue.add(p.right);
                    q = p.right;
                }
            }
            if (!is && !queue.isEmpty()) {
                p = queue.poll();
                if (p.left != null) {
                    stack.push(p.left);
                    q = p.left;
                }
                if (p.right != null) {
                    stack.push(p.right);
                    q = p.right;
                }
            }

            list.add(p.val);
            if (index == p) {
                li.add(list);
                list = new LinkedList<Integer>();
                index = q;
                is = !is;
            }
        }
        return li;
    }

}
