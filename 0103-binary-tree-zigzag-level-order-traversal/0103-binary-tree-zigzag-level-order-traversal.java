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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
      List<List<Integer> >res=new ArrayList<>();
        if(root==null)return res;
        boolean flag=true;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            ArrayList<Integer>l= new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode tem= q.poll();
                l.add(tem.val);
                if(tem.left!=null)
                {
                    q.offer(tem.left);
                }
                if(tem.right!=null)
                {
                    q.offer(tem.right);
                }


            }
            if(flag==false)
            {
                Collections.reverse(l);
            }
            flag=!flag;
            res.add(l);
        }
        return res;
    }
}
   
