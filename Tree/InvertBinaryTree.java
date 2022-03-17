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
public class InvertBinaryTree {
    
    // leetcode question Number : 226
    // Given the root of a binary tree, invert the tree, and return its root.

    // Check this image for ref: https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg
    // Input: root = [4,2,7,1,3,6,9]
    // Output: [4,7,2,9,6,3,1]

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
}
