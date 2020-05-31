public class BinaryTree {
    TreeNode root;
    public BinaryTree() {
        root = null;
    }

    public BinaryTree(key) {
        root = TreeNode(key);
    }

    class TreeNode {
        int value;
        TreeNode left,right;

        public TreeNode(int value) {
            this.value = value;
            left = right = null;
        /* following is the tree after above statement

              value
            /   \
          null  null     */
        }
    }



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.root.left = new TreeNode(2);
        binaryTree.root.right = new TreeNode(3);
        binaryTree.root.left.left = new TreeNode(4);
    }
}

/*
A Tree node contains following parts.
\1. Data
\2. Pointer to left child
\3. Pointer to right child
 */