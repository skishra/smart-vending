package com.skrahaman;

import java.util.Iterator;
public interface BinaryTreeADT<E>{
    public boolean isEmpty();
    public int size();
    public boolean contains(E targetElement);
    public String toString();
    public Iterator<E> iterator();
    public Iterator<E> iteratorInOrder();
    public Iterator<E> iteratorPreOrder();
    public Iterator<E> iteratorPostOrder();
    public Iterator<E> iteratorLevelOrder();
}
