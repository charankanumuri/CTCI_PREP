package Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BSTValidator {

    // leetcode question Number : 98
    // Given the root of a binary tree, determine if it is a valid binary search
    // tree (BST).

    // A valid BST is defined as follows:

    // The left subtree of a node contains only nodes with keys less than the node's
    // key.
    // The right subtree of a node contains only nodes with keys greater than the
    // node's key.
    // Both the left and right subtrees must also be binary search trees.

    // check this image for ref:
    // https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg
    // Input: root = [5,1,4,null,null,3,6]
    // Output: false
    // Explanation: The root node's value is 5 but its right child's value is 4.

    public boolean isValidBST(TreeNode root) {
        // to check the left node & right node values we will use min & max
        return bstValidator(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean bstValidator(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;
        // left node should be in between -INF & root node value
        // right node should be in between root node value & +INF
        return bstValidator(root.left, min, root.val) && bstValidator(root.right, root.val, max);
    }
}
