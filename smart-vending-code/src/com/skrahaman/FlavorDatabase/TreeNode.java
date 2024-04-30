package com.skrahaman.FlavorDatabase;

public class TreeNode<E extends Comparable<E>> implements Comparable<TreeNode<E>> {
    private E element;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode() {
        this.element = null;
        this.left = null;
        this.right = null;
    }

    public TreeNode(E element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public E getElement() {
        return element;
    }

    public E setElement(E element) {
        if (element == null) {
            return null;
        }
        return this.element = element;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public TreeNode<E> setLeft(TreeNode<E> node) {
        if (node == null) {
            return null;
        }
        return left = node;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public TreeNode<E> setRight(TreeNode<E> node) {
        if (node == null) {
            return null;
        }
        return right = node;
    }

    public int getHeight() {
        return getHeight(this);
    }

    private int getHeight(TreeNode<E> root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeight(root.getLeft());
            int rightHeight = getHeight(root.getRight());
            return (1 + Math.max(leftHeight, rightHeight));
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" + "element=" + element + '}';
    }

    @Override
    public int compareTo(TreeNode<E> treeNode) {
        return this.element.compareTo(treeNode.element);
    }
}