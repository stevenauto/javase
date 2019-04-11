package steven.search_sort.search;
/*
https://yq.aliyun.com/articles/624364?spm=a2c4e.11153940.blogcont625869.27.5117431fMQ49CL
https://yq.aliyun.com/articles/625869
 */

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {

        this.root = root;
    }

    public void setRoot(BinaryTreeNode root) {

        this.root = root;
    }

    public BinaryTreeNode getRoot() {

        return root;
    }

    public void clear(BinaryTreeNode node) {
        if (node != null) {
            clear(node.getLeftChild());
            clear(node.getRightChild());
            node = null;
        }
    }

    public void clear() {

        clear(root);
    }

    public boolean isEmpty() {

        return root == null;
    }

    public int height() {

        return height(root);
    }

    public int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int l = height(node.getLeftChild());
            int r = height(node.getRightChild());
            return l < r ? r + 1 : l + 1;
        }
    }

    public int size() {

        return size(root);
    }

    public int size(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.getLeftChild()) + size(node.getRightChild());
        }
    }

    public BinaryTreeNode getParent(BinaryTreeNode node) {
        return (root == null || root == node) ? null : getParent(root, node);
    }

    public BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node) {
        if (subTree == null) {
            return null;
        }
        if (subTree.getLeftChild() == node || subTree.getRightChild() == node) {
            return subTree;
        }
        BinaryTreeNode parent = null;
        if ((parent = getParent(subTree.getLeftChild(), node)) != null) {
            return parent;
        } else {
            return getParent(subTree.getRightChild(), node);
        }
    }

    public BinaryTreeNode getLeftTree(BinaryTreeNode node) {

        return node.getLeftChild();
    }

    public BinaryTreeNode getRightTree(BinaryTreeNode node) {

        return node.getRightChild();
    }

    public void insertLeft(BinaryTreeNode parent, BinaryTreeNode newNode) {
        parent.setLeftChild(newNode);
    }

    public void insertRight(BinaryTreeNode parent, BinaryTreeNode newNode) {
        parent.setRightChild(newNode);
    }

    public void visited(BinaryTreeNode node) {

    }

    public void preOrder(BinaryTreeNode node) {
        if (node != null) {
            visited(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public void inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            visited(node);
            inOrder(node.getRightChild());
        }
    }

    public void postOrder(BinaryTreeNode node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            visited(node);
        }
    }
}
