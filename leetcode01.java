import java.util.LinkedList;
import java.util.Queue;
public class Solution {
    public int run(TreeNode root) {
       if(root == null){
           return 0;
       } 
        if(root.left==null&&root.right==null){
            return 1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            int len = queue.size();
            for(int i=0;i<len;i++){
            TreeNode cur = queue.poll();
            if(cur.left==null && cur.right==null){
                return depth;
            }
             if(cur.left!=null){
              queue.offer(cur.left);
            }
             if(cur.right!=null){
             queue.offer(cur.right);
            }
          }
            
        } 
        return 0;
    }
}
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
 Given a binary tree, find its minimum depth.The minimum depth is
 the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
