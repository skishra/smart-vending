package com.skrahaman.FlavorDatabase;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {
    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(E element) {
        super(element);
    }

    public BinarySearchTree(TreeNode<E> root) {
        super(root);
    }

    public BinarySearchTree(TreeNode<E> root, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        super(root, leftTree, rightTree);
    }

    public TreeNode<E> add(E element) {
        return add(element, getRoot());
    }

    private TreeNode<E> add(E element, TreeNode<E> node) {
        if (node == null) {
            return new TreeNode<>(element);
        } else if (element.compareTo(node.getElement()) == 0) {
            return node;
        } else if (element.compareTo(node.getElement()) < 0) {
            node.setLeft(add(element, node.getLeft()));
            return node;
        } else {
            node.setRight(add(element, node.getRight()));
            return node;
        }
    }

    private TreeNode<E> balance(TreeNode<E> node) {

    }

    private TreeNode<E> rotateRight(TreeNode<E> node) {
        TreeNode<E> temp = node.getLeft();
        node.setLeft(temp.getRight());
        temp.setRight(node);
        return temp;
    }

    private TreeNode<E> rotateLeft(TreeNode<E> node) {
        TreeNode<E> temp = node.getRight();
        node.setRight(temp.getLeft());
        temp.setLeft(node);
        return temp;
    }

    private TreeNode<E> rotateRightLeft(TreeNode<E> node) {
        TreeNode<E> temp = node.getRight();
        node.setRight(rotateRight(temp));
        return rotateLeft(node);
    }

    private TreeNode<E> rotateLeftRight(TreeNode<E> node) {
        TreeNode<E> temp = node.getLeft();
        node.setLeft(rotateLeft(temp));
        return rotateRight(node);
    }
}