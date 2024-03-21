package com.skrahaman;

import java.util.LinkedList;

public class LinkedQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e) {
        list.add(e);
    }

    public E first() {
        return list.getFirst();
    }

    public E dequeue() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
