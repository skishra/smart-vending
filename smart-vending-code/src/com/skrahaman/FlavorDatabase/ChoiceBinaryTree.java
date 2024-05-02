package com.skrahaman.FlavorDatabase;

public class ChoiceBinaryTree<E extends Comparable<E>> extends BinaryTree<E>{
    public void add(E element, TreeNode<E> node, boolean leftOrRight) {
        // left is true, right is false
        if (leftOrRight) {
            node.setLeft(new TreeNode<>(element));
        }
        node.setRight(new TreeNode<>(element));
    }
}
