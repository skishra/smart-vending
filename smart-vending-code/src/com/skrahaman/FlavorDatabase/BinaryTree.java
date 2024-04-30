package com.skrahaman.FlavorDatabase;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree<E extends Comparable<E>> implements Iterable<E> {
    private TreeNode<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(E element) {
        this.root = new TreeNode<>(element);
    }

    public BinaryTree(TreeNode<E> root) {
        this.root = root;
    }

    public BinaryTree(TreeNode<E> root, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        this.root = root;

        this.root.setLeft(leftTree.root);
        this.root.setRight(rightTree.root);
    }

    public TreeNode<E> find(E element) {
        return find(element, root);
    }

    private TreeNode<E> find(E element, TreeNode<E> root) {
        if (root == null) {
            return null;
        }

        if (root.getElement().equals(element)) {
            return root;
        }

        TreeNode<E> temp = find(element, root.getLeft());

        if (temp == null) {
            temp = find(element, root.getRight());
        }

        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        return iteratorPreOrder();
    }

    public Iterator<E> iteratorPreOrder() {
        ArrayList<E> arrayList = new ArrayList<>();

        preOrder(root, arrayList);

        return new TreeIterator<>(arrayList.iterator());
    }

    private void preOrder(TreeNode<E> root, ArrayList<E> arrayList) {
        if (root != null) {
            arrayList.add(root.getElement());

            preOrder(root.getLeft(), arrayList);

            preOrder(root.getRight(), arrayList);
        }
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public int size() {
        if (root == null) {
            return 0;
        }

        return root.getHeight();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}