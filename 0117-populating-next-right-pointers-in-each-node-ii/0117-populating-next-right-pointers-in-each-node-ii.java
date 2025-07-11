/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        // Connect the left child to the right child
        if (root.left != null) {
            root.left.next = root.right;
        }

        // Connect the right child to the next available node
        if (root.right != null) {
            root.right.next = findNext(root.next);
        }

        // Connect the left child to the next available node if right child is null
        if (root.left != null && root.right == null) {
            root.left.next = findNext(root.next);
        }

        // Recur for right child first, then left child (to ensure `next` pointers are set properly)
         //connect(root.left);
        connect(root.right);
        connect(root.left);

        return root;
    }

    private Node findNext(Node node) {
        while (node != null) {
            if (node.left != null) {
                return node.left;
            }
            if (node.right != null) {
                return node.right;
            }
            node = node.next;
        }
        return null;
    }
}
