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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean is = true;
        while (queue.isEmpty()){
            List<Integer> li = new ArrayList<Integer>();
            int count = queue.size();
            for (int i =0;i<count;i++){
                TreeNode p = queue.poll();
                if (is){
                    li.add(p.val);
                }else {
                    li.add(0,p.val);
                }
                if (p.left != null){
                    queue.add(p.left);
                }
                if (p.right != null){
                    queue.add(p.reight);
                }
            }
            list.add(li);
            is = !is;
        }
        return list;
    }
    
    
}
