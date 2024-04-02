package com.skrahaman;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
        left = null;
        right = null;
    }

    public TreeNode(E element, LinkedBinaryTree<E> left, LinkedBinaryTree<E> right) {
        this.element = element;
        if (left == null) {
            this.left = null;
        } else {
            this.left = left.root;
        }

        if (right == null) {
            this.right = null;
        } else {
            this.right = right.root;
        }
    }

    public int numChildren() {
        int children = 0;
        if (left != null) {
            children = 1 + left.numChildren();
        }

        if (right != null) {
            children = 1 + right.numChildren();
        }

        return children;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }

    public TreeNode<E> getRight() {
        return right;
    }
}