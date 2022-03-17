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
public class LowestCommonAncestorBST {

    // leetcode question Number : 235
    // Given a binary search tree (BST), find the lowest common ancestor (LCA) of
    // two given nodes in the BST.

    // According to the definition of LCA on Wikipedia:
    // “The lowest common ancestor is defined between two nodes p and q as the
    // lowest node in T that has both p and q as descendants
    // (where we allow a node to be a descendant of itself).”

    // check this image for ref:
    // https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png

    // Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
    // Output: 6
    // Explanation: The LCA of nodes 2 and 8 is 6.

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val > root.val && q.val > root.val) {
            // If both p and q are greater than parent
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            // If both p and q are lesser than parent
            return lowestCommonAncestor(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }
}
