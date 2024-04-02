package com.skrahaman;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedBinaryTree<E> implements BinaryTreeADT<E>, Iterable<E>{
    protected TreeNode<E> root;
    public LinkedBinaryTree(){
        this.root = null;
    }
    public LinkedBinaryTree(E element){
        this.root = new TreeNode<>(element);
    }
    public LinkedBinaryTree(E element, LinkedBinaryTree<E> left, LinkedBinaryTree<E> right){
        root = new TreeNode<>(element);
        root.setLeft(left.root);
        root.setRight(right.root);
    }
    public E find(E targetElement){
        TreeNode<E> current = findNode(targetElement, root);
        return current.getElement();
    }
    public TreeNode<E> findNode(E targetElement, TreeNode<E> node){
        if(node == null)
        {
            return null;
        }
        if(node.getElement().equals(targetElement))
        {
            return node;
        }
        TreeNode<E> temp = findNode(targetElement, node.getLeft());
        if(temp == null)
            temp = findNode(targetElement, node.getRight());
        return temp;
    }

    public  LinkedBinaryTree<E> getLeftTree(TreeNode<E> node) {
        LinkedBinaryTree<E> temp = new LinkedBinaryTree<E>(root.getLeft().getElement());
        temp.root.setLeft(node.getLeft().getLeft());
        temp.root.setRight(node.getRight().getRight());
        return temp;
    }

    public LinkedBinaryTree<E> getRightTree(TreeNode<E> node) {
        LinkedBinaryTree<E> temp = new LinkedBinaryTree<E>(node.getRight().getElement());
        temp.root.setLeft(node.getLeft().getLeft());
        temp.root.setRight(node.getRight().getRight());
        return temp;
    }

    public int height(TreeNode<E> node){
        if(node == null)
            return 0;
        else{
            int leftHeight = height(node.getLeft());
            int rightHeight = height(node.getRight());
            return (1+Math.max(leftHeight, rightHeight));
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return nodeSize(root);
    }

    @Override
    public boolean contains(E targetElement) {
        return find(targetElement) != null;
    }

    private int nodeSize(TreeNode<E> node) {
        if(node == null)
            return 0;
        else{
            int leftHeight = height(node.getLeft());
            int rightHeight = height(node.getRight());
            return leftHeight + rightHeight;
        }
    }

    public String toString(){
        String result = "";
        Iterator<E> iter = iterator();
        while(iter.hasNext()){
            result += iter.next()+"\n";
        }
        return result;
    }
    public Iterator<E> iterator(){
        return iteratorInOrder();
    }
    public Iterator<E> iteratorInOrder(){
        ArrayList<E> tempList = new ArrayList<>();
        inOrder(root, tempList);
        return new TreeIterator(tempList.iterator());
    }

    @Override
    public Iterator<E> iteratorPreOrder() {
        return null;
    }

    @Override
    public Iterator<E> iteratorPostOrder() {
        return null;
    }

    public void inOrder(TreeNode<E> node, ArrayList<E> tempList){
        if(node != null){
            inOrder(node.getLeft(),tempList);
            tempList.add(node.getElement());
            inOrder(node.getRight(), tempList);
        }
    }

    public Iterator<E> iteratorLevelOrder() {
        LinkedList<TreeNode<E>> nodes
                = new LinkedList<TreeNode<E>>();
        LinkedList<E> tempList = new LinkedList<E>();
        TreeNode<E> current;

        nodes.add(root);

        while (!nodes.isEmpty()) {
            current = nodes.removeFirst();

            if (current != null) {
                tempList.add(current.getElement());
                if (current.getLeft() != null) {
                    nodes.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    nodes.add(current.getRight());
                }
            } else {
                tempList.add(null);
            }
        }

        return new TreeIterator(tempList.iterator());
    }

}